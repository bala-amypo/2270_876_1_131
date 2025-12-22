package com.example.demo.service;

import com.example.demo.entity.ZoneRestoration;
import java.util.List;

public interface ZoneRestorationService {
    List<ZoneRestoration> getAllRestorations();
    ZoneRestoration getRestorationById(Long id);
    ZoneRestoration createRestoration(ZoneRestoration zoneRestoration);
    ZoneRestoration updateRestoration(Long id, ZoneRestoration zoneRestoration);
    void deleteRestoration(Long id);
}