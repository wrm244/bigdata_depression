package com.bigdata.service.impl;

import com.bigdata.dao.YearPerSexDepressedDao;
import com.bigdata.domain.YearPerSexDepressed;
import com.bigdata.service.YearPerSexDepressedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class YearPerSexDepressedServiceImpl implements YearPerSexDepressedService {
    @Autowired
    private YearPerSexDepressedDao yearPerSexDepressedDao;

    @Override
    public List<Map<String, YearPerSexDepressed>> selectMale() {
        return yearPerSexDepressedDao.selectMaleData();
    }

    @Override
    public List<Map<String, YearPerSexDepressed>> selectFemale() {
        return yearPerSexDepressedDao.selectFemaleData();
    }
}
