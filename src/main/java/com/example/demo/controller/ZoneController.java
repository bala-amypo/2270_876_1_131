package com.example.demo.controller;

import com.example.demo.dto.ZoneDTO;
import com.example.demo.entity.Zone;
import com.example.demo.service.ZoneService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/zones")
public class ZoneController {

    private final ZoneService zoneService;

    public ZoneController(ZoneService zoneService) {
        this.zoneService = zoneService;
    }

    @PostMapping("/create")
    public Zone createZone(@RequestBody ZoneDTO dto) {
        Zone zone = Zone.builder()
                .id(System.currentTimeMillis())
                .name(dto.getName())
                .build();
        return zoneService.createZone(zone);
    }

    @PutMapping("/update/{id}")
    public Zone updateZone(@PathVariable Long id, @RequestBody ZoneDTO dto) {
        Zone zone = Zone.builder().name(dto.getName()).build();
        return zoneService.updateZone(id, zone);
    }
}
