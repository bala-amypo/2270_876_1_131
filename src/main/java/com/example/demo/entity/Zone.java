package com.example.demo.entity;

import java.time.Instant;

public class Zone {

    private Long id;
    private String zoneName;
    private int priorityLevel;
    private long population;
    private boolean active;
    private Instant updatedAt;

    public Zone() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getZoneName() { return zoneName; }
    public void setZoneName(String zoneName) { this.zoneName = zoneName; }

    public int getPriorityLevel() { return priorityLevel; }
    public void setPriorityLevel(int priorityLevel) { this.priorityLevel = priorityLevel; }

    public long getPopulation() { return population; }
    public void setPopulation(long population) { this.population = population; }

    public boolean getActive() { return active; }
    public void setActive(boolean active) { this.active = active; }

    public Instant getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(Instant updatedAt) { this.updatedAt = updatedAt; }
}
