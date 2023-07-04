package com.bigdata.service;

import com.bigdata.domain.YearPerSexDepressedPre;

import java.util.List;
import java.util.Map;

public interface YearPerSexDepressedPreService {
    List<Map<String, YearPerSexDepressedPre>> selectMale();
    List<Map<String, YearPerSexDepressedPre>> selectFemale();
}
