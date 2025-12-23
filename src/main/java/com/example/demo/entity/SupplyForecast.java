package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "supply_forecast")
public class SupplyForecast {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String zoneName;
    private double predictedLoad;
    private double availableSupply;

    private LocalDateTime generatedAt;

    // Default constructor
    public SupplyForecast() {
        this.generatedAt = LocalDateTime.now();
    }

    // Parameterized constructor
    public SupplyForecast(String zoneName, double predictedLoad, double availableSupply) {
        this.zoneName = zoneName;
        this.predictedLoad = predictedLoad;
        this.availableSupply = availableSupply;
        this.generatedAt = LocalDateTime.now();
    }

    // Getters & Setters
    public Long getId() {
        return id;
    }

    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public double getPredictedLoad() {
        return predictedLoad;
    }

    public void setPredictedLoad(double predictedLoad) {
        this.predictedLoad = predictedLoad;
    }

    public double getAvailableSupply() {
        return availableSupply;
    }

    public void setAvailableSupply(double availableSupply) {
        this.availableSupply = availableSupply;
    }

    public LocalDateTime getGeneratedAt() {
        return generatedAt;
    }

    public void setGeneratedAt(LocalDateTime generatedAt) {
        this.generatedAt = generatedAt;
    }
}
