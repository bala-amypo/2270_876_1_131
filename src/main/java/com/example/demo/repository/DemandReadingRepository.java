package com.example.demo.repository;

import com.example.demo.entity.DemandReading;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DemandReadingRepository extends JpaRepository<DemandReading, Long> {

    // Returns latest demand reading for a given zone
    Optional<DemandReading> findFirstByZoneIdOrderByCreatedAtDesc(Long zoneId);
}
