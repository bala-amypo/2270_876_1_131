package com.example.demo.service;

import com.example.demo.entity.DemandReading;

import java.util.Optional;

public interface DemandReadingService {
    DemandReading createReading(DemandReading reading);
    Optional<DemandReading> getLatestReading(Long zoneId);
}
