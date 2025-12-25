package com.example.demo.service;

import com.example.demo.entity.LoadSheddingEvent;

import java.util.List;

public interface LoadSheddingService {

    LoadSheddingEvent createEvent(LoadSheddingEvent event);

    LoadSheddingEvent updateEvent(Long id, LoadSheddingEvent event);

    void deleteEvent(Long id);

    List<LoadSheddingEvent> getAllEvents();
}
