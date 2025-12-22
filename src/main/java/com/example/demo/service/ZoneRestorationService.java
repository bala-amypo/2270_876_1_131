package com.example.demo.service;

import com.example.demo.entity.ZoneRestoration;
import java.util.List;

public interface ZoneRestorationService {
    ZoneRestoration create(ZoneRestoration restoration);
    List<ZoneRestoration> getAll();
}
