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
        zone.setActive(true);
        zone.setUpdatedAt(Instant.now());
        return repository.save(zone);
    }

    @Override
    public Zone updateZone(Long id, Zone zone) {
        Zone existing = repository.findById(id).orElseThrow();

        existing.setZoneName(zone.getZoneName());
        existing.setPriorityLevel(zone.getPriorityLevel());
        existing.setPopulation(zone.getPopulation());
        existing.setActive(zone.getActive());
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

    @Override
    public List<Zone> getAllZones() {
        return repository.findAll();
    }
}
