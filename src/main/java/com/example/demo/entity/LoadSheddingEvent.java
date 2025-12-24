package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.Instant;

@Entity
public class LoadSheddingEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double demandMW;
    private double supplyMW;
    private Instant eventStart;

    @ManyToOne
    private Zone zone;

    public LoadSheddingEvent() {}

    public Long getId() { return id; }
    public double getDemandMW() { return demandMW; }
    public double getSupplyMW() { return supplyMW; }
    public Instant getEventStart() { return eventStart; }
    public Zone getZone() { return zone; }

    public void setId(Long id) { this.id = id; }
    public void setDemandMW(double demandMW) { this.demandMW = demandMW; }
    public void setSupplyMW(double supplyMW) { this.supplyMW = supplyMW; }
    public void setEventStart(Instant eventStart) { this.eventStart = eventStart; }
    public void setZone(Zone zone) { this.zone = zone; }
}
