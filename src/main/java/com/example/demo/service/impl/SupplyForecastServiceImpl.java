package com.example.demo.service.impl;

import com.example.demo.entity.SupplyForecast;
import com.example.demo.repository.SupplyForecastRepository;
import com.example.demo.service.SupplyForecastService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SupplyForecastServiceImpl implements SupplyForecastService {

    private final SupplyForecastRepository repository;

    public SupplyForecastServiceImpl(SupplyForecastRepository repository) {
        this.repository = repository;
    }

    @Override
    public SupplyForecast saveForecast(SupplyForecast forecast) {
        return repository.save(forecast);
    }

    @Override
    public Optional<SupplyForecast> getLatestForecast() {
        return repository.findFirstByOrderByGeneratedAtDesc();
    }
}
