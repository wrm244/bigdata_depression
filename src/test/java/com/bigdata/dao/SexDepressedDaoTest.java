package com.bigdata.dao;

import com.bigdata.domain.HdiDepressed;
import com.bigdata.domain.SexDepressed;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

/**
 * 人类发展指数与抑郁人数测试类
 *
 * @author 吴河山
 * @date 2023/07/03 10:15
 */
@SpringBootTest
public class SexDepressedDaoTest {
    @Autowired
    private SexDepressedDao sexDepressedDao;

    @Test
    void sexDepressedSelectAll(){
        List<Map<String, SexDepressed>> sexDepressed = sexDepressedDao.selectAll();
        System.out.println(sexDepressed);
    }
}
