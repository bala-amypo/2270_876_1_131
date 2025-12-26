package com.example.demo.service;

import com.example.demo.entity.Zone;
import java.util.List;

public interface ZoneService {

    Zone createZone(Zone zone);

    Zone getZoneById(long id);

    List<Zone> getAllZones();

    Zone deactivateZone(Long id);
}
