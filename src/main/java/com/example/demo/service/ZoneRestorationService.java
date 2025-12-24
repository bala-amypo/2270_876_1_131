package com.example.demo.service;

import com.example.demo.entity.ZoneRestoration;
import java.util.List;

public interface ZoneRestorationService {

    ZoneRestoration saveRestoration(ZoneRestoration restoration);

    List<ZoneRestoration> getAllRestorations();
}
