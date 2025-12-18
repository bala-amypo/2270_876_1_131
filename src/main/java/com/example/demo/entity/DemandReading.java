package com.example.loadshedding.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@Entity
@Table(name = "demand_readings")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DemandReading {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "zone_id")
    private Zone zone;

    @Column(nullable = false)
    private Double demandMW;

    @Column(nullable = false)
    private Instant recordedAt;
}
