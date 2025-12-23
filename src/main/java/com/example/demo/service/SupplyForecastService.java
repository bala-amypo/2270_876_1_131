package com.example.demo.service;

import com.example.demo.entity.SupplyForecast;
import com.example.demo.repository.SupplyForecastRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SupplyForecastService {

    private final SupplyForecastRepository repository;

    public SupplyForecastService(SupplyForecastRepository repository) {
        this.repository = repository;
    }

    public SupplyForecast saveForecast(SupplyForecast forecast) {
        return repository.save(forecast);
    }

    public Optional<SupplyForecast> getLatestForecast() {
        return repository.findFirstByOrderByGeneratedAtDesc();
    }
}
