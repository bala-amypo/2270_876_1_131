package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.Instant;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SupplyForecast {

    @Id
    @GeneratedValue
    private Long id;

    private double supplyMW;
    private Instant createdAt;
    private Instant updatedAt;
}
