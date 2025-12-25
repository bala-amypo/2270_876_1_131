package com.example.demo.service.impl;

import com.example.demo.entity.LoadSheddingEvent;
import com.example.demo.repository.LoadSheddingRepository;
import com.example.demo.service.LoadSheddingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoadSheddingServiceImpl implements LoadSheddingService {

    private final LoadSheddingRepository repository;

    public LoadSheddingServiceImpl(LoadSheddingRepository repository) {
        this.repository = repository;
    }

    @Override
    public LoadSheddingEvent createEvent(LoadSheddingEvent event) {
        return repository.save(event);
    }

    @Override
    public List<LoadSheddingEvent> getAllEvents() {
        return repository.findAll();
    }
}
