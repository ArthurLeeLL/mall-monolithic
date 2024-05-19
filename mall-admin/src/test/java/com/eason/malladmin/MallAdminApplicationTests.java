package com.eason.malladmin;

import com.eason.malladmin.dao.UmsAdminDao;
import com.eason.malladmin.model.UmsAdmin;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MallAdminApplicationTests {

    private static final Logger LOGGER = LoggerFactory.getLogger(MallAdminApplicationTests.class);

    @Autowired
    UmsAdminDao umsAdminDao;

    @Test
    void contextLoads() {
        System.out.println("Test function has been called");
    }

    @Test
    void testSelectByIdSimple() {
        UmsAdmin umsAdmin = umsAdminDao.selectByIdSimple(1L);
        LOGGER.info("Test function testSelectByIdSimple result={}", umsAdmin);
    }
}
