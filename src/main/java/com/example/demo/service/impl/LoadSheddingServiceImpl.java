package com.example.demo.service.impl;

import com.example.demo.entity.LoadSheddingEvent;
import com.example.demo.entity.Zone;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class LoadSheddingServiceImpl {

    public LoadSheddingEvent create(Zone zone) {
        return LoadSheddingEvent.builder()
                .zone(zone)
                .eventStart(Instant.now())
                .eventEnd(Instant.now().plusSeconds(3600))
                .reason("High demand")
                .expectedDemandReductionMW(20.0)
                .build();
    }
}
