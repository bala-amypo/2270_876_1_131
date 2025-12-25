package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class LoadSheddingEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime eventTime;

    // ===== GETTER / SETTER =====
    public void setEventTime(LocalDateTime eventTime) {
        this.eventTime = eventTime;
    }
}
