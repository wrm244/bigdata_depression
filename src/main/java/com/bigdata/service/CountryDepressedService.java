package com.bigdata.service;
import com.bigdata.domain.CountryDepressed;

import java.util.List;
import java.util.Map;

public interface CountryDepressedService {
    List<Map<String, CountryDepressed>> selectAll();
}
