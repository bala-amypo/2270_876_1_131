package com.example.demo.entity;

import java.time.Instant;

public class DemandReading {

    private double demandMW;
    private Instant recordedAt;
    private Zone zone;

    public DemandReading() {}

    public double getDemandMW() { return demandMW; }
    public void setDemandMW(double demandMW) { this.demandMW = demandMW; }

    public Instant getRecordedAt() { return recordedAt; }
    public void setRecordedAt(Instant recordedAt) { this.recordedAt = recordedAt; }

    public Zone getZone() { return zone; }
    public void setZone(Zone zone) { this.zone = zone; }
}
