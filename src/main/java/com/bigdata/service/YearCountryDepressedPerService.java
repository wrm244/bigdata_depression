package com.bigdata.service;

import com.bigdata.domain.YearCountryDepressedPer;

import java.util.List;
import java.util.Map;

public interface YearCountryDepressedPerService {
    List<Map<String, YearCountryDepressedPer>> selectAll();
}
