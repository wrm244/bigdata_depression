package com.bigdata.service;

import com.bigdata.domain.YearDepressed;

import java.util.List;
import java.util.Map;

public interface YearDepressedService {
    List<Map<String, YearDepressed>> selectAll();
}
