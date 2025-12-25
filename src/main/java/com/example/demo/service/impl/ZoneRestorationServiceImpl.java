package com.example.demo.service.impl;

import com.example.demo.entity.ZoneRestorationRecord;
import com.example.demo.repository.ZoneRestorationRepository;
import com.example.demo.service.ZoneRestorationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class ZoneRestorationServiceImpl implements ZoneRestorationService {

    @Autowired
    private ZoneRestorationRepository repository;

    @Override
    public ZoneRestorationRecord restoreZone(ZoneRestorationRecord record) {
        record.setRestoredAt(Instant.now());
        return repository.save(record);
    }
}
