package com.example.demo.entity;

import lombok.*;
import jakarta.persistence.*;
import java.time.Instant;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Zone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String zoneName;
    private Integer priorityLevel;
    private Integer population;
    private Boolean active = true;
    private Instant createdAt = Instant.now();
    private Instant updatedAt = Instant.now();
}
