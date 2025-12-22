package com.example.demo.controller;

import com.example.demo.entity.DemandReading;
import com.example.demo.service.DemandReadingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/demand-readings")
public class DemandReadingController {

    private final DemandReadingService demandReadingService;

    @Autowired
    public DemandReadingController(DemandReadingService demandReadingService) {
        this.demandReadingService = demandReadingService;
    }

    @GetMapping
    public List<DemandReading> getAllReadings() {
        return demandReadingService.getAllReadings();
    }

    @GetMapping("/{id}")
    public DemandReading getReadingById(@PathVariable Long id) {
        return demandReadingService.getReadingById(id);
    }

    @PostMapping
    public DemandReading createReading(@RequestBody DemandReading reading) {
        return demandReadingService.createReading(reading);
    }

    @PutMapping("/{id}")
    public DemandReading updateReading(@PathVariable Long id, @RequestBody DemandReading reading) {
        return demandReadingService.updateReading(id, reading);
    }

    @DeleteMapping("/{id}")
    public void deleteReading(@PathVariable Long id) {
        demandReadingService.deleteReading(id);
    }
}
