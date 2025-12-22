package com.example.demo.entity;

import java.time.Instant;

public class SupplyForecast {
    private Long id;
    private double value;
    private Instant forecastStart;
    private Instant forecastEnd;

    public SupplyForecast() {}

    public SupplyForecast(Long id, double value, Instant forecastStart, Instant forecastEnd) {
        this.id = id;
        this.value = value;
        this.forecastStart = forecastStart;
        this.forecastEnd = forecastEnd;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public double getValue() { return value; }
    public void setValue(double value) { this.value = value; }

    public Instant getForecastStart() { return forecastStart; }
    public void setForecastStart(Instant forecastStart) { this.forecastStart = forecastStart; }

    public Instant getForecastEnd() { return forecastEnd; }
    public void setForecastEnd(Instant forecastEnd) { this.forecastEnd = forecastEnd; }
}
