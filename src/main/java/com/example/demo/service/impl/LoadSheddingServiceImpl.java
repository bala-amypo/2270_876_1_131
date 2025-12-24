package com.example.demo.service.impl;

import com.example.demo.entity.LoadSheddingEvent;
import com.example.demo.entity.Zone;
import com.example.demo.repository.LoadSheddingEventRepository;
import com.example.demo.service.LoadSheddingService;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class LoadSheddingServiceImpl implements LoadSheddingService {

    private final LoadSheddingEventRepository repository;

    public LoadSheddingServiceImpl(LoadSheddingEventRepository repository) {
        this.repository = repository;
    }

    @Override
    public LoadSheddingEvent createEvent(Zone zone, double demand, double supply) {
        LoadSheddingEvent event = new LoadSheddingEvent();
        event.setZone(zone);
        event.setDemandMW(demand);
        event.setSupplyMW(supply);
        event.setEventStart(Instant.now());
        return repository.save(event);
    }

    @Override
    public void deleteEvent(Long id) {
        repository.deleteById(id);
    }
}
