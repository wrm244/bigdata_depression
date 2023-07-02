package com.bigdata.service.impl;

import com.bigdata.dao.AgeDepressedDao;
import com.bigdata.domain.AgeDepressed;
import com.bigdata.service.AgeDepressedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class AgeDepressedServiceImpl implements AgeDepressedService {
    @Autowired
    private AgeDepressedDao ageDepressedDao;
    @Override
    public List<Map<String, AgeDepressed>> selectAll() {
        return ageDepressedDao.selectAll();
    }
}
