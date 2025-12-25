package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.Instant;

@Entity
public class DemandReading {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long zoneId;
    private double readingValue;
    private Instant createdAt;

    public DemandReading() {}

    public DemandReading(Long zoneId, double readingValue, Instant createdAt) {
        this.zoneId = zoneId;
        this.readingValue = readingValue;
        this.createdAt = createdAt;
    }

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getZoneId() { return zoneId; }
    public void setZoneId(Long zoneId) { this.zoneId = zoneId; }

    public double getReadingValue() { return readingValue; }
    public void setReadingValue(double readingValue) { this.readingValue = readingValue; }

    public Instant getCreatedAt() { return createdAt; }
    public void setCreatedAt(Instant createdAt) { this.createdAt = createdAt; }
}
