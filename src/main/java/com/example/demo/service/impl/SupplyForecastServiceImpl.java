package com.example.demo.service.impl;

import com.example.demo.entity.*;
import com.example.demo.exception.*;
import com.example.demo.repository.*;
import java.util.*;

public class SupplyForecastServiceImpl {

    private final SupplyForecastRepository repo;

    public SupplyForecastServiceImpl(SupplyForecastRepository r) {
        repo = r;
    }

    public SupplyForecast createForecast(SupplyForecast f) {
        if (f.getAvailableSupplyMW() < 0)
            throw new BadRequestException(">= 0");

        if (f.getForecastEnd().isBefore(f.getForecastStart()))
            throw new BadRequestException("range");

        return repo.save(f);
    }

    public SupplyForecast updateForecast(Long id, SupplyForecast f) {
        SupplyForecast ex = repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Forecast not found"));

        ex.setAvailableSupplyMW(f.getAvailableSupplyMW());
        ex.setForecastStart(f.getForecastStart());
        ex.setForecastEnd(f.getForecastEnd());

        return repo.save(ex);
    }

    public SupplyForecast getLatestForecast() {
        return repo.findFirstByOrderByGeneratedAtDesc()
                .orElseThrow(() -> new ResourceNotFoundException("No forecasts"));
    }

    public List<SupplyForecast> getAllForecasts() {
        return repo.findAll();
    }
}
