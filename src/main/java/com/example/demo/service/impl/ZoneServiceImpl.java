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
        zone.setCreatedAt(Instant.now());
        zone.setActive(true);
        return zoneRepository.save(zone);
    }

    @Override
    public List<Zone> getAllZones() {
        return zoneRepository.findAll();
    }

    @Override
    public Zone updateZone(Long id, Zone updated) {
        Zone existing = zoneRepository.findById(id).orElseThrow();
        existing.setName(updated.getName());
        existing.setPopulation(updated.getPopulation());
        existing.setUpdatedAt(Instant.now());
        return zoneRepository.save(existing);
    }

    @Override
    public void deleteZone(Long id) {
        zoneRepository.deleteById(id);
    }
}
