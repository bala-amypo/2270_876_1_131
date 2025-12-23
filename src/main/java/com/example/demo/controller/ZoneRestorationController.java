package com.example.demo.controller;

import com.example.demo.entity.ZoneRestoration;
import com.example.demo.service.ZoneRestorationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/zone-restoration")
public class ZoneRestorationController {

    private final ZoneRestorationService service;

    public ZoneRestorationController(ZoneRestorationService service) {
        this.service = service;
    }

    @PostMapping
    public ZoneRestoration create(@RequestBody ZoneRestoration restoration) {
        return service.createRestoration(restoration);
    }
}
