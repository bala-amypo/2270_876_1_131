package com.example.demo.service.impl;

import com.example.demo.entity.DemandReading;
import com.example.demo.repository.DemandReadingRepository;
import com.example.demo.service.DemandReadingService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class DemandReadingServiceImpl implements DemandReadingService {

    private final DemandReadingRepository repository;

    public DemandReadingServiceImpl(DemandReadingRepository repository) {
        this.repository = repository;
    }

    @Override
    public DemandReading createReading(DemandReading reading) {
        if (reading.getRecordedAt() == null) {
            reading.setRecordedAt(LocalDateTime.now());
        }
        return repository.save(reading);
    }
}
