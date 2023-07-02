package com.bigdata.service.impl;

import com.bigdata.dao.HdiDepressedDao;
import com.bigdata.domain.HdiDepressed;
import com.bigdata.service.HdiDepressedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class HdiDepressedServiceImpl implements HdiDepressedService {
    @Autowired
    private HdiDepressedDao hdiDepressedDao;

    @Override
    public List<Map<String, HdiDepressed>> selectAll() {
        return hdiDepressedDao.selectAll();
    }
}
