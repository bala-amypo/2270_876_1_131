package com.example.demo.entity;
import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "zone_restoration_records")
public class ZoneRestorationRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "zone_id", nullable = false)
    private Zone zone;

    private Timestamp restoredAt;
    private Long eventId;
    private String notes;

    public ZoneRestorationRecord() {}

    public ZoneRestorationRecord(Zone zone, Timestamp restoredAt, Long eventId, String notes) {
        this.zone = zone;
        this.restoredAt = restoredAt;
        this.eventId = eventId;
        this.notes = notes;
    }

    public Long getId() { 
        return id; 
    }

    public Zone getZone() { 
        return zone; 
    }

    public void setZone(Zone zone) { 
    this.zone = zone; 
    }

    public Timestamp getRestoredAt() { 
        return restoredAt; 
    }

    public void setRestoredAt(Timestamp restoredAt) { 
    this.restoredAt = restoredAt; 
    }

    public Long getEventId() { 
    return eventId; 
    }

    public void setEventId(Long eventId) { 
    this.eventId = eventId; 
    }

    public String getNotes() { 
    return notes; 
    }

    public void setNotes(String notes) { 
    this.notes = notes; 
    }
}
