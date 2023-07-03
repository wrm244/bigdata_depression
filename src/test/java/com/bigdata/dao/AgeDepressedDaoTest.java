package com.bigdata.dao;

import com.bigdata.domain.AgeDepressed;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

/**
 * 年龄与抑郁人数测试类
 *
 * @author 吴河山
 * @date 2023/07/03 10:15
 */
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
