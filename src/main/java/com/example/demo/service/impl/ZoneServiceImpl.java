package com.example.demo.service.impl;

import com.example.demo.entity.Zone;
import com.example.demo.exception.*;
import com.example.demo.repository.ZoneRepository;
import com.example.demo.service.ZoneService;
import java.time.Instant;
import java.util.*;

public class ZoneServiceImpl implements ZoneService {

    private final ZoneRepository repo;

    public ZoneServiceImpl(ZoneRepository repo) {
        this.repo = repo;
    }

    public Zone createZone(Zone z) {
        if (z.getPriorityLevel() == null || z.getPriorityLevel() < 1)
            throw new BadRequestException("priority >= 1");

        repo.findByZoneName(z.getZoneName()).ifPresent(e -> {
            throw new BadRequestException("unique");
        });

        z.setActive(true);
        return repo.save(z);
    }

    public Zone updateZone(Long id, Zone z) {
        Zone ex = repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Zone not found"));

        ex.setZoneName(z.getZoneName());
        ex.setPriorityLevel(z.getPriorityLevel());
        ex.setPopulation(z.getPopulation());
        ex.setActive(z.getActive());
        ex.setUpdatedAt(Instant.now());
        return repo.save(ex);
    }

    public void deactivateZone(Long id) {
        Zone z = repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Zone not found"));
        z.setActive(false);
        repo.save(z);
    }

    public Zone getZoneById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("not found"));
    }

    public List<Zone> getAllZones() {
        return repo.findAll();
    }
}
