package com.example.demo.service.impl;

import com.example.demo.entity.Zone;
import com.example.demo.service.ZoneService;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ZoneServiceImpl implements ZoneService {

    private final List<Zone> zones = new ArrayList<>();

    @Override
    public Zone createZone(Zone zone) {
        zone.setCreatedAt(Instant.now());
        zone.setUpdatedAt(Instant.now());
        zones.add(zone);
        return zone;
    }

    @Override
    public Zone updateZone(Long id, Zone zone) {
        Optional<Zone> existingOpt = zones.stream().filter(z -> z.getId().equals(id)).findFirst();
        if (existingOpt.isPresent()) {
            Zone existing = existingOpt.get();
            existing.setUpdatedAt(Instant.now());
            existing.setName(zone.getName());
            return existing;
        }
        return null;
    }

    @Override
    public void deactivateZone(Long id) {
        zones.removeIf(z -> z.getId().equals(id));
    }

    @Override
    public List<Zone> getAllZones() {
        return zones;
    }
}
