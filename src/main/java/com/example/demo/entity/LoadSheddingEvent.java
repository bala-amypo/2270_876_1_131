package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class LoadSheddingEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double demandMW;
    private double supplyMW;
    private LocalDateTime startTime;

    @ManyToOne
    private Zone zone;

    public LoadSheddingEvent() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public double getDemandMW() { return demandMW; }
    public void setDemandMW(double demandMW) { this.demandMW = demandMW; }

    public double getSupplyMW() { return supplyMW; }
    public void setSupplyMW(double supplyMW) { this.supplyMW = supplyMW; }

    public LocalDateTime getStartTime() { return startTime; }
    public void setStartTime(LocalDateTime startTime) { this.startTime = startTime; }

    public Zone getZone() { return zone; }
    public void setZone(Zone zone) { this.zone = zone; }
}
