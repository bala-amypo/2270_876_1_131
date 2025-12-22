package com.example.demo.controller;

import com.example.demo.entity.LoadSheddingEvent;
import com.example.demo.service.LoadSheddingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/load-shedding")
public class LoadSheddingController {

    private final LoadSheddingService loadSheddingService;

    @Autowired
    public LoadSheddingController(LoadSheddingService loadSheddingService) {
        this.loadSheddingService = loadSheddingService;
    }

    @GetMapping
    public List<LoadSheddingEvent> getAllEvents() {
        return loadSheddingService.getAllEvents();
    }

    @GetMapping("/{id}")
    public LoadSheddingEvent getEventById(@PathVariable Long id) {
        return loadSheddingService.getEventById(id);
    }

    @PostMapping
    public LoadSheddingEvent createEvent(@RequestBody LoadSheddingEvent event) {
        return loadSheddingService.createEvent(event);
    }

    @PutMapping("/{id}")
    public LoadSheddingEvent updateEvent(@PathVariable Long id, @RequestBody LoadSheddingEvent event) {
        return loadSheddingService.updateEvent(id, event);
    }

    @DeleteMapping("/{id}")
    public void deleteEvent(@PathVariable Long id) {
        loadSheddingService.deleteEvent(id);
    }
}
