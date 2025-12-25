package com.example.demo.service.impl;

import com.example.demo.entity.LoadSheddingEvent;
import com.example.demo.repository.LoadSheddingRepository;
import com.example.demo.service.LoadSheddingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LoadSheddingServiceImpl implements LoadSheddingService {

    private final LoadSheddingRepository repository;

    @Override
    public LoadSheddingEvent createEvent(LoadSheddingEvent event) {
        return repository.save(event);
    }

    @Override
    public LoadSheddingEvent updateEvent(Long id, LoadSheddingEvent event) {
        LoadSheddingEvent existing = repository.findById(id).orElseThrow();
        existing.setZone(event.getZone());
        existing.setStartTime(event.getStartTime());
        existing.setEndTime(event.getEndTime());
        existing.setDescription(event.getDescription());
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
