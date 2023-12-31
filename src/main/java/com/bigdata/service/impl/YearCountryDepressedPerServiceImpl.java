package com.bigdata.service.impl;

import com.bigdata.dao.YearCountryDepressedPerDao;
import com.bigdata.domain.YearCountryDepressedPer;
import com.bigdata.service.YearCountryDepressedPerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 每年每个国家每十万人中抑郁人数业务层实现类
 *
 * @author zgs
 * @date 2023/07/03 13:14
 */
@Service
public class YearCountryDepressedPerServiceImpl implements YearCountryDepressedPerService {
    @Autowired
    private YearCountryDepressedPerDao yearCountryDepressedPerDao;

    @Override
    public List<Map<String, YearCountryDepressedPer>> selectAll() {
        return yearCountryDepressedPerDao.selectAll();
    }
}
