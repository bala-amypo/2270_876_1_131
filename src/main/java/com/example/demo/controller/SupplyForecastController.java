package com.example.demo.controller;

import com.example.demo.entity.SupplyForecast;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/supply-forecast")
public class SupplyForecastController {

    @PostMapping
    public SupplyForecast createSupplyForecast(@RequestBody SupplyForecast supplyForecast) {
        // In real projects, this would call a service layer
        return supplyForecast;
    }

    @GetMapping
    public String test() {
        return "Supply Forecast Controller is working";
    }
}
