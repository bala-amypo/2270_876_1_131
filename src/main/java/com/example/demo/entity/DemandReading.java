package com.example.demo.entity;
import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
// @Table(name = "demand_readings")
public class DemandReading {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "zone_id", nullable = false)
    private Zone zone;

    @Column(nullable = false)
    private Double demandMW;

    @Column(nullable = false)
    private Timestamp recordedAt;

    public DemandReading() {}

    public DemandReading(Zone zone, Double demandMW, Timestamp recordedAt) {
        this.zone = zone;
        this.demandMW = demandMW;
        this.recordedAt = recordedAt;
    }

    public Long getId() { 
        return id; 
    }

    public Zone getZone() { 
        return zone; 
    }

    public void setZone(Zone zone) { 
        this.zone = zone; 
    }

    public Double getDemandMW() { 
        return demandMW; 
    }

    public void setDemandMW(Double demandMW) { 
        this.demandMW = demandMW; 
    }

    public Timestamp getRecordedAt() { 
        return recordedAt; 
    }
    public void setRecordedAt(Timestamp recordedAt) { 
        this.recordedAt = recordedAt; 
    }
}
