package com.bigdata.dao;

import com.bigdata.domain.AgeDepressed;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
public class AgeDepressedDaoTest {
    @Autowired
    private AgeDepressedDao ageDepressedDao;

    @Test
    void ageDepressedSelectAll(){
        List<Map<String,AgeDepressed>> ageDepressed = ageDepressedDao.selectAll();
        System.out.println(ageDepressed);
    }
}
