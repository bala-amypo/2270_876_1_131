package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class ZoneRestorationRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime restoredAt;

    @ManyToOne
    private Zone zone;

    public ZoneRestorationRecord() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public LocalDateTime getRestoredAt() { return restoredAt; }
    public void setRestoredAt(LocalDateTime restoredAt) { this.restoredAt = restoredAt; }

    public Zone getZone() { return zone; }
    public void setZone(Zone zone) { this.zone = zone; }
}
