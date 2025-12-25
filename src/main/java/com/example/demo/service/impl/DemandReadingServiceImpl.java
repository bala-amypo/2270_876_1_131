package com.example.demo.service.impl;

import com.example.demo.entity.DemandReading;
import com.example.demo.repository.DemandReadingRepository;
import com.example.demo.service.DemandReadingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemandReadingServiceImpl implements DemandReadingService {

    private final DemandReadingRepository demandReadingRepository;

    public DemandReadingServiceImpl(DemandReadingRepository demandReadingRepository) {
        this.demandReadingRepository = demandReadingRepository;
    }

    @Override
    public DemandReading createReading(DemandReading reading) {
        return demandReadingRepository.save(reading);
    }

    @Override
    public List<DemandReading> getAllReadings() {
        return demandReadingRepository.findAll();
    }

    @Override
    public DemandReading getLatestReading(long zoneId) {
        return demandReadingRepository
                .findFirstByZoneIdOrderByRecordedAtDesc(zoneId);
    }
}
