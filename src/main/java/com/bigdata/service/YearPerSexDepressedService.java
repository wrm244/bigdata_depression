package com.bigdata.service;

import com.bigdata.domain.YearPerSexDepressed;

import java.util.List;
import java.util.Map;

public interface YearPerSexDepressedService {
    List<Map<String, YearPerSexDepressed>> selectMale();
    List<Map<String, YearPerSexDepressed>> selectFemale();
}
