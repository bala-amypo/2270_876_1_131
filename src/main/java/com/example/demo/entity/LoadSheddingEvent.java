package com.example.loadshedding.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

@Entity
@Table(name = "load_shedding_events")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoadSheddingEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "zone_id")
    private Zone zone;

    @Column(nullable = false)
    private Instant eventStart;

    @Column(nullable = false)
    private Instant eventEnd;

    @Column(nullable = false)
    private String reason;

    @Column(nullable = false)
    private Long triggeredByForecastId;

    @Column(nullable = false)
    private Double expectedDemandReductionMW;

    public LoadSheddingEvent() {
}

public LoadSheddingEvent(Long id, Zone zone, Instant eventStart,Instant eventEnd, String reason,Long triggeredByForecastId,Double expectedDemandReductionMW) {
    this.id = id;
    this.zone = zone;
    this.eventStart = eventStart;
    this.eventEnd = eventEnd;
    this.reason = reason;
    this.triggeredByForecastId = triggeredByForecastId;
    this.expectedDemandReductionMW = expectedDemandReductionMW;
}

}
