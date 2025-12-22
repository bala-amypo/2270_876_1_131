package com.example.demo.service.impl;

import com.example.demo.entity.*;
import com.example.demo.exception.BadRequestException;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.*;
import com.example.demo.service.LoadSheddingService;

import java.time.Instant;
import java.util.List;

public class LoadSheddingServiceImpl implements LoadSheddingService {

    private final SupplyForecastRepository forecastRepository;
    private final ZoneRepository zoneRepository;
    private final DemandReadingRepository readingRepository;
    private final LoadSheddingEventRepository eventRepository;

    public LoadSheddingServiceImpl(SupplyForecastRepository forecastRepository,
                                   ZoneRepository zoneRepository,
                                   DemandReadingRepository readingRepository,
                                   LoadSheddingEventRepository eventRepository) {
        this.forecastRepository = forecastRepository;
        this.zoneRepository = zoneRepository;
        this.readingRepository = readingRepository;
        this.eventRepository = eventRepository;
    }

    @Override
    public LoadSheddingEvent triggerLoadShedding(Long forecastId) {
        SupplyForecast forecast = forecastRepository.findById(forecastId)
                .orElseThrow(() -> new ResourceNotFoundException("Forecast not found"));

        List<Zone> zones = zoneRepository.findByActiveTrueOrderByPriorityLevelAsc();

        if (zones.isEmpty()) {
            throw new BadRequestException("No suitable zones");
        }

        for (Zone zone : zones) {
            readingRepository.findFirstByZoneIdOrderByRecordedAtDesc(zone.getId())
                    .ifPresent(reading -> {
                        if (reading.getDemandMW() > forecast.getAvailableSupplyMW()) {
                            LoadSheddingEvent event = LoadSheddingEvent.builder()
                                    .zone(zone)
                                    .eventStart(Instant.now())
                                    .triggeredByForecastId(forecastId)
                                    .expectedDemandReductionMW(reading.getDemandMW())
                                    .reason("Load shedding due to overload")
                                    .build();
                            eventRepository.save(event);
                        }
                    });
        }

        return eventRepository.findAll().stream()
                .reduce((first, second) -> second)
                .orElseThrow(() -> new BadRequestException("No overload"));
    }

    @Override
    public LoadSheddingEvent getEventById(Long id) {
        return eventRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Event not found"));
    }

    @Override
    public List<LoadSheddingEvent> getEventsForZone(Long zoneId) {
        return eventRepository.findByZoneIdOrderByEventStartDesc(zoneId);
    }

    @Override
    public List<LoadSheddingEvent> getAllEvents() {
        return eventRepository.findAll();
    }
}
