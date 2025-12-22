package com.example.demo.service.impl;

import com.example.demo.entity.Zone;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class ZoneServiceImpl {

    public Zone create(Zone zone) {
        zone.setCreatedAt(Instant.now());
        zone.setUpdatedAt(Instant.now());
        return zone;
    }

    public Zone update(Zone existing) {
        existing.setUpdatedAt(Instant.now());
        return existing;
    }
}
