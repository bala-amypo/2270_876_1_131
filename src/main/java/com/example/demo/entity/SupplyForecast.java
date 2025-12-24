package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "supply_forecast")
public class SupplyForecast {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String zoneName;

    private Double supplyValue;

    private Instant forecastTime;

    private Instant updatedAt;

    public SupplyForecast() {
    }

    public SupplyForecast(Long id, String zoneName, Double supplyValue, Instant forecastTime, Instant updatedAt) {
        this.id = id;
        this.zoneName = zoneName;
        this.supplyValue = supplyValue;
        this.forecastTime = forecastTime;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public Double getSupplyValue() {
        return supplyValue;
    }

    public void setSupplyValue(Double supplyValue) {
        this.supplyValue = supplyValue;
    }

    public Instant getForecastTime() {
        return forecastTime;
    }

    public void setForecastTime(Instant forecastTime) {
        this.forecastTime = forecastTime;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }
}
