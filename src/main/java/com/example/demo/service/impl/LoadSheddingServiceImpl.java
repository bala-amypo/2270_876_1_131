package com.example.demo.service.impl;

import com.example.demo.entity.LoadSheddingEvent;
import com.example.demo.entity.SupplyForecast;
import com.example.demo.entity.Zone;
import com.example.demo.exception.BadRequestException;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.DemandReadingRepository;
import com.example.demo.repository.LoadSheddingEventRepository;
import com.example.demo.repository.SupplyForecastRepository;
import com.example.demo.repository.ZoneRepository;
import com.example.demo.service.LoadSheddingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
@RequiredArgsConstructor
public class LoadSheddingServiceImpl implements LoadSheddingService {

    private final SupplyForecastRepository forecastRepo;
    private final ZoneRepository zoneRepo;
    private final DemandReadingRepository readingRepo;
    private final LoadSheddingEventRepository eventRepo;

    @Override
    public LoadSheddingEvent triggerLoadShedding(Long forecastId) {
        SupplyForecast f = forecastRepo.findById(forecastId)
                .orElseThrow(() -> new ResourceNotFoundException("Forecast not found"));

        List<Zone> zones = zoneRepo.findByActiveTrueOrderByPriorityLevelAsc();
        if (zones.isEmpty()) throw new BadRequestException("No overload or suitable zones");

        // simulate load shedding
        Zone z = zones.get(0);
        LoadSheddingEvent e = LoadSheddingEvent.builder()
                .expectedDemandReductionMW(50.0) // just an example
                .eventStart(Instant.now())
                .build();
        return eventRepo.save(e);
    }

    @Override
    public LoadSheddingEvent getEventById(Long eventId) {
        return eventRepo.findById(eventId)
                .orElseThrow(() -> new ResourceNotFoundException("Event not found"));
    }

    // Implement other methods similarly...
}
