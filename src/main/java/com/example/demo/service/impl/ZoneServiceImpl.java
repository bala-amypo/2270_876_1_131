package com.example.demo.service.impl;

import com.example.demo.entity.Zone;
import com.example.demo.service.ZoneService;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

@Service
public class ZoneServiceImpl implements ZoneService {

    private final Map<Long, Zone> zones = new HashMap<>();

    @Override
    public Zone createZone(Zone zone) {
        zone.setCreatedAt(Instant.now());
        zone.setUpdatedAt(Instant.now());
        zones.put(zone.getId(), zone);
        return zone;
    }

    @Override
    public Zone updateZone(Long id, Zone zone) {
        Zone existing = zones.get(id);
        if (existing != null) {
            existing.setName(zone.getName());
            existing.setUpdatedAt(Instant.now());
        }
        return existing;
    }
}
