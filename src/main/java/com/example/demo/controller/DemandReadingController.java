package com.example.demo.entity;

import java.time.Instant;

public class DemandReading {
    private Long id;
    private double value;
    private Instant recordedAt;

    public DemandReading() {}

    public DemandReading(Long id, double value, Instant recordedAt) {
        this.id = id;
        this.value = value;
        this.recordedAt = recordedAt;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public double getValue() { return value; }
    public void setValue(double value) { this.value = value; }

    public Instant getRecordedAt() { return recordedAt; }
    public void setRecordedAt(Instant recordedAt) { this.recordedAt = recordedAt; }
}
