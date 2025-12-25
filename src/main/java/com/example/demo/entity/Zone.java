package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.Instant;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Zone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String zoneName; // use zoneName instead of getName
    private Integer priorityLevel;
    private Integer population;
    private Boolean active = true;

    private Instant createdAt;
    private Instant updatedAt;
}
