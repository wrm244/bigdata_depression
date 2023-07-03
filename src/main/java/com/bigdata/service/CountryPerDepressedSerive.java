package com.bigdata.service;

import com.bigdata.domain.CountryPerDepressed;

import java.util.List;
import java.util.Map;

public interface CountryPerDepressedSerive {
    List<Map<String, CountryPerDepressed>> selectAll();
}
