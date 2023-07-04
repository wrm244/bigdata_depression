package com.bigdata.service.impl;

import com.bigdata.dao.YearPerSexDepressedDao;
import com.bigdata.dao.YearPerSexDepressedPreDao;
import com.bigdata.domain.YearPerSexDepressed;
import com.bigdata.domain.YearPerSexDepressedPre;
import com.bigdata.service.YearPerSexDepressedPreService;
import com.bigdata.service.YearPerSexDepressedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class YearPerSexDepressedPreServiceImpl implements YearPerSexDepressedPreService {
    @Autowired
    private YearPerSexDepressedPreDao yearPerSexDepressedPreDao;

    @Override
    public List<Map<String, YearPerSexDepressedPre>> selectMale() {
        return yearPerSexDepressedPreDao.selectMaleData();
    }

    @Override
    public List<Map<String, YearPerSexDepressedPre>> selectFemale() {
        return yearPerSexDepressedPreDao.selectFemaleData();
    }
}
