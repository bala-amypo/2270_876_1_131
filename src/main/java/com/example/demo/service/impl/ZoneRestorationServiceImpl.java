package com.example.demo.service.impl;

import com.example.demo.entity.*;
import com.example.demo.exception.*;
import com.example.demo.repository.*;
import java.util.*;

public class ZoneRestorationServiceImpl {

    private final ZoneRestorationRecordRepository repo;
    private final LoadSheddingEventRepository eventRepo;
    private final ZoneRepository zoneRepo;

    public ZoneRestorationServiceImpl(
            ZoneRestorationRecordRepository r,
            LoadSheddingEventRepository e,
            ZoneRepository z) {
        repo = r;
        eventRepo = e;
        zoneRepo = z;
    }

    public ZoneRestorationRecord restoreZone(ZoneRestorationRecord r) {
        LoadSheddingEvent ev = eventRepo.findById(r.getEventId())
                .orElseThrow(() -> new ResourceNotFoundException("Event not found"));

        if (r.getRestoredAt().isBefore(ev.getEventStart()))
            throw new BadRequestException("after event start");

        zoneRepo.findById(r.getZone().getId())
                .orElseThrow(() -> new ResourceNotFoundException("Zone not found"));

        return repo.save(r);
    }

    public List<ZoneRestorationRecord> getRecordsForZone(Long id) {
        return repo.findByZoneIdOrderByRestoredAtDesc(id);
    }

    public ZoneRestorationRecord getRecordById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Record not found"));
    }
}
