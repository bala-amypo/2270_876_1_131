package com.example.demo.entity;

import java.time.Instant;

public class LoadSheddingEvent {

    private Long id;
    private Zone zone;
    private double demandMW;
    private double supplyMW;
    private Instant eventStart;

    public LoadSheddingEvent() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Zone getZone() { return zone; }
    public void setZone(Zone zone) { this.zone = zone; }

    public double getDemandMW() { return demandMW; }
    public void setDemandMW(double demandMW) { this.demandMW = demandMW; }

    public double getSupplyMW() { return supplyMW; }
    public void setSupplyMW(double supplyMW) { this.supplyMW = supplyMW; }

    public Instant getEventStart() { return eventStart; }
    public void setEventStart(Instant eventStart) { this.eventStart = eventStart; }
}
