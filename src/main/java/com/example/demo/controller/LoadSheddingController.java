package com.example.demo.controller;

import com.example.demo.entity.LoadSheddingEvent;
import com.example.demo.service.LoadSheddingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/load-shedding")
public class LoadSheddingController {

    private final LoadSheddingService service;

    public LoadSheddingController(LoadSheddingService service) {
        this.service = service;
    }

    @PostMapping
    public LoadSheddingEvent create(@RequestBody LoadSheddingEvent event) {
        return service.createEvent(event);
    }

    @PutMapping("/{id}")
    public LoadSheddingEvent update(@PathVariable Long id,
        @RequestBody LoadSheddingEvent event) {
        return service.updateEvent(id, event);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteEvent(id);
    }
}
