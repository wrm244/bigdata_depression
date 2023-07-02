package com.bigdata.service;

import com.bigdata.domain.HdiDepressed;

import java.util.List;
import java.util.Map;

public interface HdiDepressedService {
    List<Map<String, HdiDepressed>> selectAll();
}
