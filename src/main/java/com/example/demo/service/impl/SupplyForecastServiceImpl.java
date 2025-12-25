package com.example.demo.service.impl;

import com.example.demo.entity.SupplyForecast;
import com.example.demo.repository.SupplyForecastRepository;
import com.example.demo.service.SupplyForecastService;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Comparator;
import java.util.List;

@Service
public class SupplyForecastServiceImpl implements SupplyForecastService {

    private final SupplyForecastRepository repository;

    public SupplyForecastServiceImpl(SupplyForecastRepository repository) {
        this.repository = repository;
    }

    @Override
    public SupplyForecast saveForecast(SupplyForecast forecast) {
        if (forecast.getCreatedAt() == null) {
            forecast.setCreatedAt(Instant.now());
        }
        forecast.setUpdatedAt(Instant.now());
        return repository.save(forecast);
    }

    @Override
    public List<SupplyForecast> getAllForecasts() {
        return repository.findAll();
    }

    @Override
    public SupplyForecast getLatestForecast() {
        return repository.findAll()
                .stream()
                .max(Comparator.comparing(SupplyForecast::getCreatedAt))
                .orElse(null);
    }
}
