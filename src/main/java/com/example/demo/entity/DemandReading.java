package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class DemandReading {

    @Id
    private Long id;

    private Long zoneId;         
    private Double demand;
    private LocalDateTime recordedAt;

    public DemandReading() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getZoneId() {
        return zoneId;
    }

    public void setZoneId(Long zoneId) {
        this.zoneId = zoneId;
    }

    public Double getDemand() {
        return demand;
    }

    public void setDemand(Double demand) {
        this.demand = demand;
    }

    public LocalDateTime getRecordedAt() {
        return recordedAt;
    }

    public void setRecordedAt(LocalDateTime recordedAt) {
        this.recordedAt = recordedAt;
    }
}
