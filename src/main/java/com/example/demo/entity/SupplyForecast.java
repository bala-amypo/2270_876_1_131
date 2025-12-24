package com.example.demo.entity;

import lombok.*;
import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SupplyForecast {
    private Long id;
    private Double availableSupplyMW;
    private Instant forecastStart;
    private Instant forecastEnd;
    private Instant generatedAt = Instant.now();
}
