package com.example.demo.service.impl;

import com.example.demo.entity.ZoneRestoration;
import com.example.demo.service.ZoneRestorationService;
import org.springframework.stereotype.Service;

@Service
public class ZoneRestorationServiceImpl implements ZoneRestorationService {

    @Override
    public ZoneRestoration createRestoration(ZoneRestoration restoration) {
        return restoration;
    }
}
