package com.example.demo.service;

import com.example.demo.entity.DemandReading;

public interface DemandReadingService {
    DemandReading getLatestReading(long zoneId);
}
