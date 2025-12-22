package com.example.demo.service.impl;

import com.example.demo.entity.SupplyForecast;
import org.springframework.stereotype.Service;

@Service
public class SupplyForecastServiceImpl {

    public void validate(SupplyForecast forecast) {
        if (!forecast.getForecastStart().isBefore(forecast.getForecastEnd())) {
            throw new IllegalArgumentException("Invalid forecast range");
        }
    }
}
