package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ZoneRestoration {
    @Id
    private Long id;
    private String zoneName;
    private java.time.Instant restoredAt;
}
