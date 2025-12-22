package com.example.demo.service.impl;

import com.example.demo.entity.ZoneRestoration;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class ZoneRestorationServiceImpl {

    public void validate(ZoneRestoration restoration) {
        Instant now = Instant.now();
        if (restoration.getRestoredAt().isAfter(now)) {
            throw new IllegalArgumentException("RestoredAt cannot be in the future");
        }
    }
}
