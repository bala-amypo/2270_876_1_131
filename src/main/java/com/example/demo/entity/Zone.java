package com.yourapp.project.entity;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(
    name = "Zone",
    uniqueConstraints = @UniqueConstraint(columnNames = "zone_name")
)
public class Zone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "zone_name", nullable = false, unique = true)
    private String zoneName;

    @Column(nullable = false)
    private Integer priorityLevel;

    private Integer population;

    @Column(nullable = false)
    private Boolean active = true;

    private Timestamp createdAt;
    private Timestamp updatedAt;

    public Zone() {}

    public Zone(String zoneName, Integer priorityLevel, Integer population, Boolean active) {
        this.zoneName = zoneName;
        this.priorityLevel = priorityLevel;
        this.population = population;
        this.active = active;
    }

    @PrePersist
    protected void onCreate() {
        createdAt = new Timestamp(System.currentTimeMillis());
        updatedAt = createdAt;
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = new Timestamp(System.currentTimeMillis());
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

    public Integer getPriorityLevel() { 
        return priorityLevel; 
    }

    public void setPriorityLevel(Integer priorityLevel) { 
        this.priorityLevel = priorityLevel; 
    }

    public Integer getPopulation() { 
        return population; 
    }

    public void setPopulation(Integer population) { 
    this.population = population; 
    }

    public Boolean getActive() { 
    return active; 
    }

    public void setActive(Boolean active) { 
    this.active = active; 
    }

    public Timestamp getCreatedAt() { 
    return createdAt; 
    }

    public Timestamp getUpdatedAt() { 
    return updatedAt; 
    }

}
