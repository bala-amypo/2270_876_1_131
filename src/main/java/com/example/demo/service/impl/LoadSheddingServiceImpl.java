package com.example.demo.service.impl;

import com.example.demo.entity.LoadSheddingEvent;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.repository.LoadSheddingEventRepository;
import com.example.demo.service.LoadSheddingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LoadSheddingServiceImpl implements LoadSheddingService {

    private final LoadSheddingEventRepository repository;

    @Override
    public LoadSheddingEvent createEvent(LoadSheddingEvent event) {
        return repository.save(event);
    }

    @Override
    public LoadSheddingEvent updateEvent(Long eventId, LoadSheddingEvent event) {
        LoadSheddingEvent existing = repository.findById(eventId)
                .orElseThrow(() -> new ResourceNotFoundException("Event not found"));
        existing.setEventStart(event.getEventStart());
        existing.setEventEnd(event.getEventEnd());
        existing.setExpectedDemandReductionMW(event.getExpectedDemandReductionMW());
        return repository.save(existing);
    }

    @Override
    public void deleteEvent(Long eventId) {
        repository.deleteById(eventId);
    }

    @Override
    public LoadSheddingEvent getEventById(Long eventId) {
        return repository.findById(eventId)
                .orElseThrow(() -> new ResourceNotFoundException("Event not found"));
    }

    @Override
    public List<LoadSheddingEvent> getAllEvents() {
        return repository.findAll();
    }
}
