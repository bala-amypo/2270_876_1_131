package com.example.demo.service.impl;

import com.example.demo.entity.DemandReading;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.DemandReadingRepository;
import com.example.demo.service.DemandReadingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DemandReadingServiceImpl implements DemandReadingService {

    private final DemandReadingRepository repository;

    @Override
    public DemandReading saveReading(DemandReading reading) {
        reading.setCreatedAt(Instant.now());
        return repository.save(reading);
    }

    @Override
    public List<DemandReading> getAllReadings() {
        return repository.findAll();
    }

    @Override
    public DemandReading getLatestReadingByZone(Long zoneId) {
        return repository.findFirstByZoneIdOrderByCreatedAtDesc(zoneId)
                .orElseThrow(() -> new ResourceNotFoundException("No readings found for zone: " + zoneId));
    }
}
