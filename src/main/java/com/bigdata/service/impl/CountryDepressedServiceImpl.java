package com.bigdata.service.impl;

import com.bigdata.dao.CountryDepressedDao;
import com.bigdata.dao.SexDepressedDao;
import com.bigdata.domain.CountryDepressed;
import com.bigdata.domain.SexDepressed;
import com.bigdata.service.CountryDepressedService;
import com.bigdata.service.SexDepressedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 性别抑郁业务层实现类
 *
 * @author
 * @date 2023/07/03 10:14
 */
@Service
public class CountryDepressedServiceImpl implements CountryDepressedService {
    @Autowired
    private CountryDepressedDao countryDepressedDao;

    @Override
    public List<Map<String, CountryDepressed>> selectAll() {
        return countryDepressedDao.selectAll();
    }
}
