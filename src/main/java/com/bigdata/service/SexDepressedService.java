package com.bigdata.service;
import com.bigdata.domain.SexDepressed;

import java.util.List;
import java.util.Map;

public interface SexDepressedService {
    List<Map<String, SexDepressed>> selectAll();
}
