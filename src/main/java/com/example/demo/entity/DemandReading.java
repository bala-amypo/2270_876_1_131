package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "demand_reading")
public class DemandReading {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double demand;

    private String timestamp;

    // REQUIRED by JPA
    public DemandReading() {
    }

    public DemandReading(Long id, Double demand, String timestamp) {
        this.id = id;
        this.demand = demand;
        this.timestamp = timestamp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getDemand() {
        return demand;
    }

    public void setDemand(Double demand) {
        this.demand = demand;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
