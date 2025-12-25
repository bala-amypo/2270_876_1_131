package com.example.demo.service;

import com.example.demo.entity.SupplyForecast;
import java.util.List;

public interface SupplyForecastService {
    SupplyForecast saveForecast(SupplyForecast forecast);
    List<SupplyForecast> getAllForecasts();
    SupplyForecast getLatestForecast();
}
