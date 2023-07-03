package com.bigdata.service.impl;

import com.bigdata.dao.YearDepressedDao;
import com.bigdata.domain.YearDepressed;
import com.bigdata.service.YearDepressedService;
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
public class YearDepressedServiceImpl implements YearDepressedService {
    @Autowired
    private YearDepressedDao yearDepressedDao;

    @Override
    public List<Map<String, YearDepressed>> selectAll() {
        return yearDepressedDao.selectAll();
    }
}
