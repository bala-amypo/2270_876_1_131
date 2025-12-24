package com.example.demo.repository;

import java.util.*;
import com.example.demo.entity.*;

public interface SupplyForecastRepository {
    Optional<SupplyForecast> findById(Long id);
    Optional<SupplyForecast> findFirstByOrderByGeneratedAtDesc();
    List<SupplyForecast> findAll();
    SupplyForecast save(SupplyForecast f);
}
