package com.example.demo.service.impl;

import com.example.demo.entity.Zone;
import com.example.demo.service.ZoneService;
import org.springframework.stereotype.Service;

@Service
public class ZoneServiceImpl implements ZoneService {

    @Override
    public boolean isZoneActive(Zone zone) {
        return zone.getActive(); // FIXED boolean check
    }
}
