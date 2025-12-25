package com.example.demo.controller;

import com.example.demo.entity.DemandReading;
import com.example.demo.service.DemandReadingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/demand-readings")
@RequiredArgsConstructor
public class DemandReadingController {

    private final DemandReadingService service;

    @PostMapping
    public ResponseEntity<DemandReading> createReading(@RequestBody DemandReading reading) {
        DemandReading saved = service.saveReading(reading); // use saveReading
        return ResponseEntity.ok(saved);
    }

    @GetMapping
    public ResponseEntity<List<DemandReading>> getAllReadings() {
        return ResponseEntity.ok(service.getAllReadings());
    }

    @GetMapping("/latest/{zoneId}")
    public ResponseEntity<DemandReading> getLatestReading(@PathVariable Long zoneId) {
        return ResponseEntity.ok(service.getLatestReadingByZone(zoneId));
    }
}
