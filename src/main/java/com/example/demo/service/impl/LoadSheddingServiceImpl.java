package com.example.demo.service.impl;

import com.example.demo.entity.*;
import com.example.demo.exception.*;
import com.example.demo.repository.*;
import java.util.*;

public class LoadSheddingServiceImpl {

    private final SupplyForecastRepository forecastRepo;
    private final ZoneRepository zoneRepo;
    private final DemandReadingRepository readingRepo;
    private final LoadSheddingEventRepository eventRepo;

    public LoadSheddingServiceImpl(
            SupplyForecastRepository f,
            ZoneRepository z,
            DemandReadingRepository r,
            LoadSheddingEventRepository e) {
        forecastRepo = f;
        zoneRepo = z;
        readingRepo = r;
        eventRepo = e;
    }

    public LoadSheddingEvent triggerLoadShedding(Long forecastId) {
        SupplyForecast f = forecastRepo.findById(forecastId)
                .orElseThrow(() -> new ResourceNotFoundException("Forecast not found"));

        List<Zone> zones = zoneRepo.findByActiveTrueOrderByPriorityLevelAsc();
        if (zones.isEmpty())
            throw new BadRequestException("No overload");

        for (Zone z : zones) {
            Optional<DemandReading> dr =
                    readingRepo.findFirstByZoneIdOrderByRecordedAtDesc(z.getId());

            if (dr.isPresent() && dr.get().getDemandMW() > f.getAvailableSupplyMW()) {
                return eventRepo.save(
                        LoadSheddingEvent.builder()
                                .zone(z)
                                .expectedDemandReductionMW(dr.get().getDemandMW())
                                .reason("Overload")
                                .build()
                );
            }
        }
        throw new BadRequestException("No suitable");
    }

    public List<LoadSheddingEvent> getAllEvents() {
        return eventRepo.findAll();
    }

    public LoadSheddingEvent getEventById(Long id) {
        return eventRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Event not found"));
    }

    public List<LoadSheddingEvent> getEventsForZone(Long id) {
        return eventRepo.findByZoneIdOrderByEventStartDesc(id);
    }
}
