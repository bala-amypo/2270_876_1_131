package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class SupplyForecast {

    @Id
    private Long id;
    private LocalDateTime forecastStart;
    private LocalDateTime forecastEnd;

    public SupplyForecast() {}

    public LocalDateTime getForecastStart() {
        return forecastStart;
    }

    public LocalDateTime getForecastEnd() {
        return forecastEnd;
    }
}
