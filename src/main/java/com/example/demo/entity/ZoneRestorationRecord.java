package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "zone_restoration_record")
public class ZoneRestorationRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public ZoneRestorationRecord() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
