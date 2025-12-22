package com.example.demo.service.impl;

import com.example.demo.entity.ZoneRestoration;
import com.example.demo.repository.ZoneRestorationRepository;
import com.example.demo.service.ZoneRestorationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ZoneRestorationServiceImpl implements ZoneRestorationService {

    private final ZoneRestorationRepository repository;

    @Autowired
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
    public ZoneRestoration createRestoration(ZoneRestoration restoration) {
        return repository.save(restoration);
    }

    @Override
    public ZoneRestoration updateRestoration(Long id, ZoneRestoration restoration) {
        Optional<ZoneRestoration> existing = repository.findById(id);
        if (existing.isPresent()) {
            ZoneRestoration z = existing.get();
            z.setZoneName(restoration.getZoneName());
            z.setRestoredAt(restoration.getRestoredAt());
            return repository.save(z);
        }
        return null;
    }

    @Override
    public void deleteRestoration(Long id) {
        repository.deleteById(id);
    }
}
