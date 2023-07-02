package com.bigdata.dao;

import com.bigdata.domain.AgeDepressed;
import com.bigdata.domain.HdiDepressed;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;
@SpringBootTest
public class HdiDepressedDaoTest {
    @Autowired
    private HdiDepressedDao hdiDepressedDao;

    @Test
    void ageDepressedSelectAll(){
        List<Map<String, HdiDepressed>> hdiDepressed = hdiDepressedDao.selectAll();
        System.out.println(hdiDepressed);
    }
}
