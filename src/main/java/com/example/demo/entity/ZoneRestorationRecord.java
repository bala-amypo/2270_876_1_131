package com.example.demo.entity;

import lombok.*;
import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ZoneRestorationRecord {
    private Long id;
    private Zone zone;
    private Long eventId;
    private Instant restoredAt;
    private String notes;
}
