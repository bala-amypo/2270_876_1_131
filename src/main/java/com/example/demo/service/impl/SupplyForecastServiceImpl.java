package com.example.demo.service.impl;

import com.example.demo.entity.SupplyForecast;
import com.example.demo.repository.SupplyForecastRepository;
import com.example.demo.service.SupplyForecastService;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
public class SupplyForecastServiceImpl implements SupplyForecastService {

    private final SupplyForecastRepository repository;

    public SupplyForecastServiceImpl(SupplyForecastRepository repository) {
        this.repository = repository;
    }

    @Override
    public SupplyForecast saveForecast(SupplyForecast forecast) {
        forecast.setCreatedAt(Instant.now());
        return repository.save(forecast);
    }

    @Override
    public List<SupplyForecast> getAllForecasts() {
        return repository.findAll();
    }

    @Override
    public SupplyForecast getLatestForecast() {
        List<SupplyForecast> list = repository.findAll();
        return list.isEmpty() ? null : list.get(list.size() - 1);
    }
}
