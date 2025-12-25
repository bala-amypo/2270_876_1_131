package com.example.demo.service.impl;

import com.example.demo.entity.Zone;
import com.example.demo.repository.ZoneRepository;
import com.example.demo.service.ZoneService;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
public class ZoneServiceImpl implements ZoneService {

    private final ZoneRepository zoneRepository;

    public ZoneServiceImpl(ZoneRepository zoneRepository) {
        this.zoneRepository = zoneRepository;
    }

    @Override
    public Zone createZone(Zone zone) {
        zone.setActive(true);
        zone.setCreatedAt(Instant.now());
        zone.setUpdatedAt(Instant.now());
        return zoneRepository.save(zone);
    }

    @Override
    public Zone updateZone(Long id, Zone zone) {
        Zone existing = zoneRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Zone not found"));

        existing.setZoneName(zone.getZoneName());
        existing.setPopulation(zone.getPopulation());
        existing.setPriorityLevel(zone.getPriorityLevel());
        existing.setActive(zone.getActive());
        existing.setUpdatedAt(Instant.now());

        return zoneRepository.save(existing);
    }

    @Override
    public void deactivateZone(Long id) {
        Zone zone = zoneRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Zone not found"));
        zone.setActive(false);
        zone.setUpdatedAt(Instant.now());
        zoneRepository.save(zone);
    }

    @Override
    public List<Zone> getAllZones() {
        return zoneRepository.findAll();
    }

    @Override
    public Zone getZoneById(long id) {
        return zoneRepository.findById(id).orElse(null);
    }
}
