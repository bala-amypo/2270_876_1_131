package com.example.demo.entity;

import lombok.*;
import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DemandReading {
    private Long id;
    private Zone zone;
    private Double demandMW;
    private Instant recordedAt;
}
