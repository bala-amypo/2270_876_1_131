package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.Instant;

@Entity
public class SupplyForecast {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double supplyMW;
    private Instant createdAt;
    private Instant updatedAt;

    public SupplyForecast() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public double getSupplyMW() { return supplyMW; }
    public void setSupplyMW(double supplyMW) { this.supplyMW = supplyMW; }

    public Instant getCreatedAt() { return createdAt; }
    public void setCreatedAt(Instant createdAt) { this.createdAt = createdAt; }

    public Instant getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(Instant updatedAt) { this.updatedAt = updatedAt; }
}
