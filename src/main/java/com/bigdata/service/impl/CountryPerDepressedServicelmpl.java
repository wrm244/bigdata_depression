package com.bigdata.service.impl;

import com.bigdata.dao.CountryPerDepressedDao;
import com.bigdata.dao.YearDepressedDao;
import com.bigdata.domain.CountryPerDepressed;
import com.bigdata.domain.YearDepressed;
import com.bigdata.service.CountryPerDepressedSerive;
import com.bigdata.service.YearDepressedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


/**
 * 不同国家的抑郁症患者比例关系
 *
 * @author chenshuang
 * @date 2023/07/03 14:20
 */
@Service
public class CountryPerDepressedServicelmpl implements CountryPerDepressedSerive {
    @Autowired
    private CountryPerDepressedDao countryPerDepressedDao;

    @Override
    public List<Map<String, CountryPerDepressed>> selectAll() {
        return countryPerDepressedDao.selectAll();
    }
}
