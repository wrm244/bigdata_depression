package com.bigdata.service;

import com.bigdata.domain.YearCountryDepressionNo;

import java.util.List;
import java.util.Map;

public interface YearCountryDepressionNoService {
    List<Map<String, YearCountryDepressionNo>> selectAll();
}
