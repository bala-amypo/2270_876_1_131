package com.example.demo.service;

import com.example.demo.entity.DemandReading;
import java.util.List;

public interface DemandReadingService {
    List<DemandReading> getAllReadings();
    DemandReading getReadingById(Long id);
    DemandReading updateReading(Long id, DemandReading reading);
    void deleteReading(Long id);
}
