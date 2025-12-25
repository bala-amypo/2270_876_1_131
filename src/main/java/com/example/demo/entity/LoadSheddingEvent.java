package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoadSheddingEvent {
    @Id
    @GeneratedValue
    private Long id;

    private Long zoneId;
    private LocalDateTime eventStart;
}
