package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "load_shedding_events")
public class LoadSheddingEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String zoneName;
    private Instant eventTime;

    public LoadSheddingEvent() {}
    public LoadSheddingEvent(Long id, String zoneName, Instant eventTime) {
        this.id = id;
        this.zoneName = zoneName;
        this.eventTime = eventTime;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getZoneName() { return zoneName; }
    public void setZoneName(String zoneName) { this.zoneName = zoneName; }
    public Instant getEventTime() { return eventTime; }
    public void setEventTime(Instant eventTime) { this.eventTime = eventTime; }
}
