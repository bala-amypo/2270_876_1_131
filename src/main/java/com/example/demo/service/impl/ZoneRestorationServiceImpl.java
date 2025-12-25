package com.example.demo.service.impl;

import com.example.demo.entity.ZoneRestorationRecord;
import com.example.demo.repository.ZoneRestorationRecordRepository;
import com.example.demo.service.ZoneRestorationService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ZoneRestorationServiceImpl implements ZoneRestorationService {

    private final ZoneRestorationRecordRepository repository;

    public ZoneRestorationServiceImpl(ZoneRestorationRecordRepository repository) {
        this.repository = repository;
    }

    @Override
    public ZoneRestorationRecord saveRestoration(ZoneRestorationRecord record) {
        record.setRestoredAt(LocalDateTime.now());
        return repository.save(record);
    }

    @Override
    public List<ZoneRestorationRecord> getAllRestorations() {
        return repository.findAll();
    }
}
