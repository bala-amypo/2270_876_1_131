package com.example.demo.service.impl;

import com.example.demo.entity.Zone;
import com.example.demo.repository.ZoneRepository;
import com.example.demo.service.ZoneService;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
public class ZoneServiceImpl implements ZoneService {

    private final ZoneRepository repository;

    public ZoneServiceImpl(ZoneRepository repository) {
        this.repository = repository;
    }

    @Override
    public Zone createZone(Zone zone) {
        zone.setCreatedAt(Instant.now());
        zone.setActive(true);
        return repository.save(zone);
    }

    @Override
    public Zone getZoneById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Zone> getAllZones() {
        return repository.findAll();
    }

    @Override
    public Zone updateZone(Long id, Zone zone) {
        Zone existing = repository.findById(id).orElseThrow();
        existing.setName(zone.getName());
        existing.setPopulation(zone.getPopulation());
        existing.setUpdatedAt(Instant.now());
        return repository.save(existing);
    }

    @Override
    public void deactivateZone(Long id) {
        Zone zone = repository.findById(id).orElseThrow();
        zone.setActive(false);
        zone.setUpdatedAt(Instant.now());
        repository.save(zone);
    }
}
