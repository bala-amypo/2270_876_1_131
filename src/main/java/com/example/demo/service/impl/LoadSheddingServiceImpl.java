package com.example.demo.service.impl;

import com.example.demo.entity.LoadSheddingEvent;
import com.example.demo.repository.LoadSheddingEventRepository;
import com.example.demo.service.LoadSheddingService;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
public class LoadSheddingServiceImpl implements LoadSheddingService {

    private final LoadSheddingEventRepository repository;

    public LoadSheddingServiceImpl(LoadSheddingEventRepository repository) {
        this.repository = repository;
    }

    @Override
    public LoadSheddingEvent createEvent(LoadSheddingEvent event) {
        event.setEventStart(Instant.now());
        return repository.save(event);
    }

    @Override
    public LoadSheddingEvent updateEvent(Long id, LoadSheddingEvent event) {
        LoadSheddingEvent existing = repository.findById(id).orElseThrow();
        existing.setDemandMW(event.getDemandMW());
        existing.setSupplyMW(event.getSupplyMW());
        existing.setZone(event.getZone());
        return repository.save(existing);
    }

    @Override
    public void deleteEvent(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<LoadSheddingEvent> getAllEvents() {
        return repository.findAll();
    }
}
