package com.bigdata.dao;

import com.bigdata.domain.YearDepressed;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
public class YearDepressedDaoTest {
    @Autowired
    private YearDepressedDao yearDepressedDao;

    @Test
    void ageDepressedSelectAll(){
        List<Map<String, YearDepressed>> yearDepressed = yearDepressedDao.selectAll();
        System.out.println(yearDepressed);
    }
    
}
