package com.example.demo.entity;

import java.time.Instant;

public class LoadSheddingController {
    private Long id;
    private String zoneName;
    private Instant startTime;
    private Instant endTime;

    public LoadSheddingEvent() {}

    public LoadSheddingEvent(Long id, String zoneName, Instant startTime, Instant endTime) {
        this.id = id;
        this.zoneName = zoneName;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getZoneName() { return zoneName; }
    public void setZoneName(String zoneName) { this.zoneName = zoneName; }

    public Instant getStartTime() { return startTime; }
    public void setStartTime(Instant startTime) { this.startTime = startTime; }

    public Instant getEndTime() { return endTime; }
    public void setEndTime(Instant endTime) { this.endTime = endTime; }
}
