package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class DemandReading {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double demandMW;

    private LocalDateTime recordedAt;

    @ManyToOne
    private Zone zone;

    public DemandReading() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public double getDemandMW() { return demandMW; }
    public void setDemandMW(double demandMW) { this.demandMW = demandMW; }

    public LocalDateTime getRecordedAt() { return recordedAt; }
    public void setRecordedAt(LocalDateTime recordedAt) { this.recordedAt = recordedAt; }

    public Zone getZone() { return zone; }
    public void setZone(Zone zone) { this.zone = zone; }
}
