package com.example.demo.service;

import com.example.demo.entity.LoadSheddingEvent;
import java.util.List;

public interface LoadSheddingService {
    LoadSheddingEvent createEvent(LoadSheddingEvent event);
    LoadSheddingEvent updateEvent(Long eventId, LoadSheddingEvent event);
    void deleteEvent(Long eventId);
    LoadSheddingEvent getEventById(Long eventId);
    List<LoadSheddingEvent> getAllEvents();
}
