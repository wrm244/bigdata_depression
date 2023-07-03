package com.bigdata.service.impl;

import com.bigdata.dao.AgeDepressedDao;
import com.bigdata.domain.AgeDepressed;
import com.bigdata.service.AgeDepressedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 年龄抑郁业务层实现类
 *
 * @author 吴河山
 * @date 2023/07/03 10:14
 */
@Service
public class AgeDepressedServiceImpl implements AgeDepressedService {
    @Autowired
    private AgeDepressedDao ageDepressedDao;

    @Override
    public List<Map<String, AgeDepressed>> selectAll() {
        return ageDepressedDao.selectAll();
    }
}
