package com.example.demo.service.impl;

import com.example.demo.entity.ZoneRestoration;
import com.example.demo.service.ZoneRestorationService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ZoneRestorationServiceImpl implements ZoneRestorationService {

    private final List<ZoneRestoration> restorations = new ArrayList<>();

    @Override
    public ZoneRestoration create(ZoneRestoration restoration) {
        restorations.add(restoration);
        return restoration;
    }

    @Override
    public List<ZoneRestoration> getAll() {
        return restorations;
    }
}
