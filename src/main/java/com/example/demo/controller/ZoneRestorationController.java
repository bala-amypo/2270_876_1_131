package com.example.demo.controller;

import com.example.demo.entity.ZoneRestoration;
import com.example.demo.service.ZoneRestorationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/zone-restorations")
public class ZoneRestorationController {

    private final ZoneRestorationService zoneRestorationService;

    @Autowired
    public ZoneRestorationController(ZoneRestorationService zoneRestorationService) {
        this.zoneRestorationService = zoneRestorationService;
    }

    @GetMapping
    public List<ZoneRestoration> getAllRestorations() {
        return zoneRestorationService.getAllRestorations();
    }

    @GetMapping("/{id}")
    public ZoneRestoration getRestorationById(@PathVariable Long id) {
        return zoneRestorationService.getRestorationById(id);
    }

    @PostMapping
    public ZoneRestoration createRestoration(@RequestBody ZoneRestoration restoration) {
        return zoneRestorationService.createRestoration(restoration);
    }

    @PutMapping("/{id}")
    public ZoneRestoration updateRestoration(@PathVariable Long id, @RequestBody ZoneRestoration restoration) {
        return zoneRestorationService.updateRestoration(id, restoration);
    }

    @DeleteMapping("/{id}")
    public void deleteRestoration(@PathVariable Long id) {
        zoneRestorationService.deleteRestoration(id);
    }
}
