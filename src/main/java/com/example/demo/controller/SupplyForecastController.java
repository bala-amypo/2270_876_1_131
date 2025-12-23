package com.example.demo.controller;

import com.example.demo.entity.SupplyForecast;
import com.example.demo.service.SupplyForecastService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/supply-forecast")
public class SupplyForecastController {

    private final SupplyForecastService service;

    public SupplyForecastController(SupplyForecastService service) {
        this.service = service;
    }

    @PostMapping
    public SupplyForecast createForecast(@RequestBody SupplyForecast forecast) {
        return service.saveForecast(forecast);
    }

    @GetMapping("/latest")
    public SupplyForecast getLatestForecast() {
        return service.getLatestForecast().orElse(null);
    }
}
