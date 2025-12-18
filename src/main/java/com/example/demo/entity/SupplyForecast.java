package com.yourapp.project.entity;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "supply_forecasts")
public class SupplyForecast {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double availableSupplyMW;

    private Timestamp forecastStart;
    private Timestamp forecastEnd;
    private Timestamp generatedAt;

    public SupplyForecast() {}

    public SupplyForecast(Double availableSupplyMW, Timestamp forecastStart, Timestamp forecastEnd) {
        this.availableSupplyMW = availableSupplyMW;
        this.forecastStart = forecastStart;
        this.forecastEnd = forecastEnd;
    }

    @PrePersist
    protected void onGenerate() {
        generatedAt = new Timestamp(System.currentTimeMillis());
    }

    public Long getId() { return id; }

    public Double getAvailableSupplyMW() { return availableSupplyMW; }
    public void setAvailableSupplyMW(Double availableSupplyMW) {
        this.availableSupplyMW = availableSupplyMW;
    }

    public Timestamp getForecastStart() { return forecastStart; }
    public void setForecastStart(Timestamp forecastStart) { this.forecastStart = forecastStart; }

    public Timestamp getForecastEnd() { return forecastEnd; }
    public void setForecastEnd(Timestamp forecastEnd) { this.forecastEnd = forecastEnd; }

    public Timestamp getGeneratedAt() { return generatedAt; }
}
