package com.bigdata.dao;

import com.bigdata.domain.CountryPerDepressed;
import com.bigdata.domain.YearDepressed;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
public class CountryPerDepressedDaoTest {
    @Autowired
    private CountryPerDepressedDao countryPerDepressedDao;

    @Test
    void countryPerDepressedSelectAll(){
        List<Map<String, CountryPerDepressed>> countryPerDepressed = countryPerDepressedDao.selectAll();
        System.out.println(countryPerDepressed);
    }
    
}
