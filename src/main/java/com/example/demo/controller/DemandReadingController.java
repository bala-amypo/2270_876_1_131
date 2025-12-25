package com.example.demo.controller;

import com.example.demo.entity.DemandReading;
import com.example.demo.service.DemandReadingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/demand")
public class DemandReadingController {

    @Autowired
    private DemandReadingService service;

    @PostMapping("/create")
    public DemandReading createReading(@RequestBody DemandReading reading) {
        return service.createReading(reading);
    }

    @GetMapping("/latest/{zoneId}")
    public Optional<DemandReading> getLatest(@PathVariable Long zoneId) {
        return service.getLatestReading(zoneId);
    }
}
