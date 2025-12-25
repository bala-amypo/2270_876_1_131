package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.Instant;

@Entity
public class DemandReading {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long zoneId;
    private Instant createdAt;

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }
}
