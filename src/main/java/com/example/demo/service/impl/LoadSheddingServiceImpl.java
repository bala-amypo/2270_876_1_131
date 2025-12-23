package com.example.demo.service.impl;

import com.example.demo.entity.LoadSheddingEvent;
import com.example.demo.service.LoadSheddingService;
import org.springframework.stereotype.Service;

@Service
public class LoadSheddingServiceImpl implements LoadSheddingService {

    @Override
    public LoadSheddingEvent createEvent(LoadSheddingEvent event) {
        return event;
    }

    @Override
    public LoadSheddingEvent updateEvent(Long id, LoadSheddingEvent event) {
        return event;
    }

    @Override
    public void deleteEvent(Long id) {
        // delete logic
    }
}
