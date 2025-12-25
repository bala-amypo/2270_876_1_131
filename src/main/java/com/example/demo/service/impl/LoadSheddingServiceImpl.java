package com.example.demo.service.impl;

import com.example.demo.entity.LoadSheddingEvent;
import com.example.demo.repository.LoadSheddingEventRepository;
import com.example.demo.service.LoadSheddingService;
import org.springframework.stereotype.Service;

@Service
public class LoadSheddingServiceImpl implements LoadSheddingService {

    private final LoadSheddingEventRepository loadSheddingEventRepository;

    public LoadSheddingServiceImpl(LoadSheddingEventRepository loadSheddingEventRepository) {
        this.loadSheddingEventRepository = loadSheddingEventRepository;
    }

    @Override
    public LoadSheddingEvent createEvent(LoadSheddingEvent event) {
        return loadSheddingEventRepository.save(event);
    }
}
