package com.example.demo.entity;

import lombok.*;
import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoadSheddingEvent {
    private Long id;
    private Zone zone;
    private Double expectedDemandReductionMW;
    private Instant eventStart = Instant.now();
    private String reason;
}
