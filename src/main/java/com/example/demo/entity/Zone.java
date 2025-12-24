package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class Zone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private boolean active;

    public Zone() {}

    public Long getId() { return id; }
    public String getName() { return name; }
    public boolean getActive() { return active; }

    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setActive(boolean active) { this.active = active; }
}
