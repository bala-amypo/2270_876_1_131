package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "zones")
public class Zone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String zoneName;

    private String region;
    private boolean active;

    public Zone() {
    }

    public Zone(String zoneName, String region, boolean active) {
        this.zoneName = zoneName;
        this.region = region;
        this.active = active;
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

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
