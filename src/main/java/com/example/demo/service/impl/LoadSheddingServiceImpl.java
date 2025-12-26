package com.example.demo.service.impl;

import com.example.demo.entity.LoadSheddingEvent;
import com.example.demo.repository.LoadSheddingEventRepository;
import com.example.demo.service.LoadSheddingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoadSheddingServiceImpl implements LoadSheddingService {

    private final LoadSheddingEventRepository repository;

    public LoadSheddingServiceImpl(LoadSheddingEventRepository repository) {
        this.repository = repository;
    }

    @Override
    public LoadSheddingEvent createEvent(LoadSheddingEvent event) {
        return repository.save(event);
    }

    @Override
    public LoadSheddingEvent updateEvent(Long id, LoadSheddingEvent event) {
        event.setId(id);
        return repository.save(event);
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
