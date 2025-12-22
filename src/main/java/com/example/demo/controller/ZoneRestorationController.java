package com.example.demo.entity;

import java.time.Instant;

public class ZoneRestoration {
    private Long id;
    private String zoneName;
    private Instant restoredAt;

    public ZoneRestoration() {}

    public ZoneRestoration(Long id, String zoneName, Instant restoredAt) {
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
