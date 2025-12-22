package com.example.demo.service.impl;

import com.example.demo.entity.DemandReading;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class DemandReadingServiceImpl {

    public void validate(DemandReading reading) {
        Instant now = Instant.now();
        if (reading.getRecordedAt().isAfter(now)) {
            throw new IllegalArgumentException("Future reading not allowed");
        }
    }
}
