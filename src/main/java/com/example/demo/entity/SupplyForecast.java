package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SupplyForecast {
    @Id
    @GeneratedValue
    private Long id;

    private double predictedSupply;
    private LocalDateTime generatedAt;
}
