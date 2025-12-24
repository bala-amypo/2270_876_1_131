package com.example.demo.service;

import com.example.demo.entity.LoadSheddingEvent;
import com.example.demo.entity.Zone;

public interface LoadSheddingService {

    LoadSheddingEvent createEvent(Zone zone, double demand, double supply);

    void deleteEvent(Long id);
}
