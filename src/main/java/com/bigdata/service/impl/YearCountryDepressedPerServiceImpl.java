package com.bigdata.service.impl;

import com.bigdata.dao.YearCountryDepressedPerDao;
import com.bigdata.domain.YearCountryDepressedPer;
import com.bigdata.service.YearCountryDepressedPerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 人类发展指数与抑郁人数业务层实现类
 *
 * @author 吴河山
 * @date 2023/07/03 10:14
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
