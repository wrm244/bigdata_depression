package com.bigdata.service;

import com.bigdata.domain.AgeDepressed;

import java.util.List;
import java.util.Map;

public interface  AgeDepressedService {
    List<Map<String,AgeDepressed>> selectAll();
}
