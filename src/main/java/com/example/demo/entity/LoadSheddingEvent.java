package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class LoadSheddingEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String zone;
    private LocalDateTime eventStart;

    public LoadSheddingEvent() {}

    public String getZone() {
        return zone;
    }

    public LocalDateTime getEventStart() {
        return eventStart;
    }
}
