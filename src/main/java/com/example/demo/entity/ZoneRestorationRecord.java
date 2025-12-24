package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "zone_restoration")
public class ZoneRestoration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String zoneName;

    private String restorationStatus;

    private Instant restorationTime;

    private Instant updatedAt;

    public ZoneRestoration() {
    }

    public ZoneRestoration(Long id, String zoneName, String restorationStatus,
                           Instant restorationTime, Instant updatedAt) {
        this.id = id;
        this.zoneName = zoneName;
        this.restorationStatus = restorationStatus;
        this.restorationTime = restorationTime;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public String getZoneName() {
        return zoneName;
    }

    public String getRestorationStatus() {
        return restorationStatus;
    }

    public Instant getRestorationTime() {
        return restorationTime;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public void setRestorationStatus(String restorationStatus) {
        this.restorationStatus = restorationStatus;
    }

    public void setRestorationTime(Instant restorationTime) {
        this.restorationTime = restorationTime;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }
}
