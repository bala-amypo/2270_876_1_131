package com.example.demo.service.impl;

import com.example.demo.entity.SupplyForecast;
import com.example.demo.service.SupplyForecastService;
import org.springframework.stereotype.Service;

@Service
public class SupplyForecastServiceImpl implements SupplyForecastService {

    @Override
    public SupplyForecast createForecast(SupplyForecast forecast) {
        forecast.getForecastStart();
        forecast.getForecastEnd();
        return forecast;
    }
}
