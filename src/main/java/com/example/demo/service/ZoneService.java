package com.example.demo.service;

import com.example.demo.entity.Zone;
import java.util.List;

public interface ZoneService {

    Zone createZone(Zone zone);

    Zone getZoneById(long id);   // 🔥 MUST be long

    List<Zone> getAllZones();

    Zone updateZone(long id, Zone zone);

    void deactivateZone(long id);
}
