package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.Instant;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Zone {

    @Id
    @GeneratedValue
    private Long id;

    private String zoneName;
    private int priorityLevel;
    private long population;
    private boolean active;

    private Instant createdAt;
    private Instant updatedAt;
}
