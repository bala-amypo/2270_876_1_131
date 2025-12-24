package com.example.demo.entity;

import lombok.*;
import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Zone {

    private Long id;
    private String zoneName;
    private Integer priorityLevel;
    private Integer population;

    @Builder.Default
    private Boolean active = true;

    private Instant updatedAt;
}
