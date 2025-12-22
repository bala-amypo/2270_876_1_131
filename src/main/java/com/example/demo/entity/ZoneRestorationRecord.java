package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "zone_restoration_records")
public class ZoneRestorationRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String zoneName;
    private Instant restoredAt;

    public ZoneRestorationRecord() {}
    public ZoneRestorationRecord(Long id, String zoneName, Instant restoredAt) {
        this.id = id;
        this.zoneName = zoneName;
        this.restoredAt = restoredAt;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getZoneName() { return zoneName; }
    public void setZoneName(String zoneName) { this.zoneName = zoneName; }

    public Instant getRestoredAt() { return restoredAt; }
    public void setRestoredAt(Instant restoredAt) { this.restoredAt = restoredAt; }
}
