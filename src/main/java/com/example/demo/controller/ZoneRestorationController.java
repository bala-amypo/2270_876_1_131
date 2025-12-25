package com.example.demo.controller;

import com.example.demo.entity.ZoneRestorationRecord;
import com.example.demo.service.ZoneRestorationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/zone-restoration")
public class ZoneRestorationController {

    @Autowired
    private ZoneRestorationService service;

    @PostMapping("/restore")
    public ZoneRestorationRecord restore(@RequestBody ZoneRestorationRecord record) {
        return service.restoreZone(record);
    }
}
