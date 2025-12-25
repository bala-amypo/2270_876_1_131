package com.example.demo.service.impl;

import com.example.demo.entity.ZoneRestorationRecord;
import com.example.demo.repository.ZoneRestorationRecordRepository;
import com.example.demo.service.ZoneRestorationService;
import org.springframework.stereotype.Service;

@Service
public class ZoneRestorationServiceImpl implements ZoneRestorationService {

    private final ZoneRestorationRecordRepository zoneRestorationRecordRepository;

    public ZoneRestorationServiceImpl(
            ZoneRestorationRecordRepository zoneRestorationRecordRepository) {
        this.zoneRestorationRecordRepository = zoneRestorationRecordRepository;
    }

    @Override
    public ZoneRestorationRecord restoreZone(ZoneRestorationRecord record) {
        return zoneRestorationRecordRepository.save(record);
    }
}
