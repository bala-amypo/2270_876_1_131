package com.example.demo.service.impl;

import com.example.demo.entity.ZoneRestoration;
import com.example.demo.repository.ZoneRestorationRepository;
import com.example.demo.service.ZoneRestorationService;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service   // ❗ THIS MUST BE PRESENT
public class ZoneRestorationServiceImpl implements ZoneRestorationService {

    private final ZoneRestorationRepository repository;

    public ZoneRestorationServiceImpl(ZoneRestorationRepository repository) {
        this.repository = repository;
    }

    @Override
    public ZoneRestoration saveRestoration(ZoneRestoration restoration) {
        restoration.setUpdatedAt(Instant.now());
        return repository.save(restoration);
    }

    @Override
    public List<ZoneRestoration> getAllRestorations() {
        return repository.findAll();
    }
}
