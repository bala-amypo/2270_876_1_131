package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.Instant;

@Entity
public class ZoneRestorationRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String zoneName;
    private Instant restoredAt;
    private String status;

    // Default constructor
    public ZoneRestorationRecord() {}

    // Parameterized constructor
    public ZoneRestorationRecord(String zoneName, Instant restoredAt, String status) {
        this.zoneName = zoneName;
        this.restoredAt = restoredAt;
        this.status = status;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getZoneName() { return zoneName; }
    public void setZoneName(String zoneName) { this.zoneName = zoneName; }

    public Instant getRestoredAt() { return restoredAt; }
    public void setRestoredAt(Instant restoredAt) { this.restoredAt = restoredAt; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
