package com.example.demo.service.impl;

import com.example.demo.entity.DemandReading;
import com.example.demo.service.DemandReadingService;
import org.springframework.stereotype.Service;

@Service
public class DemandReadingServiceImpl implements DemandReadingService {

    @Override
    public DemandReading createReading(DemandReading reading) {
        reading.getRecordedAt();
        return reading;
    }
}
