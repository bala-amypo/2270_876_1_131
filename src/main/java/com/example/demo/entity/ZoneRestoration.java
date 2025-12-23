package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "zone_restoration")
public class ZoneRestoration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String zoneName;

    private LocalDateTime restorationTime;

    private String status;

    public ZoneRestoration() {
    }

    public ZoneRestoration(String zoneName, LocalDateTime restorationTime, String status) {
        this.zoneName = zoneName;
        this.restorationTime = restorationTime;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public LocalDateTime getRestorationTime() {
        return restorationTime;
    }

    public void setRestorationTime(LocalDateTime restorationTime) {
        this.restorationTime = restorationTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
