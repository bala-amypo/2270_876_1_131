package com.example.demo.service;

import com.example.demo.entity.LoadSheddingEvent;

public interface LoadSheddingService {
    LoadSheddingEvent createEvent(LoadSheddingEvent event);
    LoadSheddingEvent updateEvent(Long id, LoadSheddingEvent event);
    void deleteEvent(Long id);
}
