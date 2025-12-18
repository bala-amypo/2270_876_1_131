package com.example.loadshedding.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@Entity
@Table(name = "zone_restoration_records")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ZoneRestorationRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "zone_id")
    private Zone zone;

    @Column(nullable = false)
    private Instant restoredAt;

    @Column(nullable = false)
    private Long eventId;

    @Column
    private String notes;

    public ZoneRestorationRecord() {
}

public ZoneRestorationRecord(Long id, Zone zone,
                             Instant restoredAt, Long eventId,
                             String notes) {
    this.id = id;
    this.zone = zone;
    this.restoredAt = restoredAt;
    this.eventId = eventId;
    this.notes = notes;
}

}
