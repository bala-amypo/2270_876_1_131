package com.example.demo.entity;

import java.time.Instant;

public class ZoneRestorationRecord {

    private Long eventId;
    private Zone zone;
    private Instant restoredAt;

    public ZoneRestorationRecord() {}

    public Long getEventId() { return eventId; }
    public void setEventId(Long eventId) { this.eventId = eventId; }

    public Zone getZone() { return zone; }
    public void setZone(Zone zone) { this.zone = zone; }

    public Instant getRestoredAt() { return restoredAt; }
    public void setRestoredAt(Instant restoredAt) { this.restoredAt = restoredAt; }
}
