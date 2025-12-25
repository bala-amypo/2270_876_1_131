package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Entity
@Table(name = "demand_readings")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DemandReading {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long zoneId;

    private Double demandMW;

    private Instant createdAt;

    // If needed, add constructors with fields except id
    public DemandReading(Long zoneId, Double demandMW, Instant createdAt) {
        this.zoneId = zoneId;
        this.demandMW = demandMW;
        this.createdAt = createdAt;
    }
}
