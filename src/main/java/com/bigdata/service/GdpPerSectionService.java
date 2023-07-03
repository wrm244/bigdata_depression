package com.bigdata.service;

import com.bigdata.domain.GdpPerSection;
import com.bigdata.domain.YearPerSexDepressed;

import java.util.List;
import java.util.Map;

public interface GdpPerSectionService {
    List<Map<String, GdpPerSection>> selectAll();
}
