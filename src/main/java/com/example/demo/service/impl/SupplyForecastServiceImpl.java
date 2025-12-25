package com.example.demo.service.impl;

import com.example.demo.entity.SupplyForecast;
import com.example.demo.repository.SupplyForecastRepository;
import com.example.demo.service.SupplyForecastService;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
public class SupplyForecastServiceImpl implements SupplyForecastService {

    private final SupplyForecastRepository supplyForecastRepository;

    public SupplyForecastServiceImpl(SupplyForecastRepository supplyForecastRepository) {
        this.supplyForecastRepository = supplyForecastRepository;
    }

    @Override
    public SupplyForecast saveForecast(SupplyForecast forecast) {
        if (forecast.getCreatedAt() == null) {
            forecast.setCreatedAt(Instant.now());
        }
        forecast.setUpdatedAt(Instant.now());
        return supplyForecastRepository.save(forecast);
    }

    @Override
    public List<SupplyForecast> getAllForecasts() {
        return supplyForecastRepository.findAll();
    }

    @Override
    public SupplyForecast getLatestForecast() {
        return supplyForecastRepository.findFirstByOrderByCreatedAtDesc();
    }
}
