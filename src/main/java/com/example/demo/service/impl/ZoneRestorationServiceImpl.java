package com.example.demo.service.impl;

import com.example.demo.entity.ZoneRestoration;
import com.example.demo.repository.ZoneRestorationRepository;
import com.example.demo.service.ZoneRestorationService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ZoneRestorationServiceImpl implements ZoneRestorationService {

    private final ZoneRestorationRepository repository;

    public ZoneRestorationServiceImpl(ZoneRestorationRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ZoneRestoration> getAllRestorations() {
        return repository.findAll();
    }

    @Override
    public ZoneRestoration getRestorationById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public ZoneRestoration saveRestoration(ZoneRestoration zoneRestoration) {
        return repository.save(zoneRestoration);
    }

    @Override
    public ZoneRestoration updateRestoration(Long id, ZoneRestoration zoneRestoration) {
        ZoneRestoration existing = repository.findById(id).orElseThrow();
        existing.setZoneName(zoneRestoration.getZoneName());
        existing.setRestoredAt(zoneRestoration.getRestoredAt());
        return repository.save(existing);
    }

    @Override
    public void deleteRestoration(Long id) {
        repository.deleteById(id);
    }
}
