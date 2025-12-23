package com.example.demo.service;

import com.example.demo.entity.SupplyForecast;

import java.util.Optional;

public interface SupplyForecastService {

    SupplyForecast saveForecast(SupplyForecast forecast);

    Optional<SupplyForecast> getLatestForecast();
}
