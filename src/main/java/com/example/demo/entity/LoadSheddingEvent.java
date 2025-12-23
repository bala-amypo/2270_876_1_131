package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LoadSheddingEvent {

    @Id
    private Long id;
    private String zone;
    private String reason;

    public LoadSheddingEvent() {}
}
