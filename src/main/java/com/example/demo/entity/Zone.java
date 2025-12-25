package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.Instant;

@Entity
public class Zone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Integer population;
    private Boolean active;

    private Instant createdAt;
    private Instant updatedAt;

    public String getName() {
        return name;
    }

    public Integer getPopulation() {
        return population;
    }

    public Boolean getActive() {
        return active;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }
}
