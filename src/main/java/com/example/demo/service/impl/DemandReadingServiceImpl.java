package com.example.demo.service.impl;

import com.example.demo.entity.DemandReading;
import com.example.demo.repository.DemandReadingRepository;
import com.example.demo.service.DemandReadingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Optional;

@Service
public class DemandReadingServiceImpl implements DemandReadingService {

    @Autowired
    private DemandReadingRepository repository;

    @Override
    public DemandReading createReading(DemandReading reading) {
        reading.setCreatedAt(Instant.now());
        return repository.save(reading);
    }

    @Override
    public Optional<DemandReading> getLatestReading(Long zoneId) {
        return repository.findTopByZoneIdOrderByCreatedAtDesc(zoneId);
    }
}
