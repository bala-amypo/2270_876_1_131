package com.example.demo.service.impl;

import com.example.demo.entity.DemandReading;
import com.example.demo.repository.DemandReadingRepository;
import com.example.demo.service.DemandReadingService;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
public class DemandReadingServiceImpl implements DemandReadingService {

    private final DemandReadingRepository repository;

    public DemandReadingServiceImpl(DemandReadingRepository repository) {
        this.repository = repository;
    }

    @Override
    public DemandReading createReading(DemandReading reading) {
        reading.setCreatedAt(Instant.now());
        return repository.save(reading);
    }

    @Override
    public List<DemandReading> getAllReadings() {
        return repository.findAll();
    }

    @Override
    public DemandReading getLatestReading(long zoneId) {
        return repository.findTopByZoneIdOrderByCreatedAtDesc(zoneId);
    }
}
