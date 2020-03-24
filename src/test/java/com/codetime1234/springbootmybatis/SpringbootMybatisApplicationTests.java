package com.codetime1234.springbootmybatis;

import com.codetime1234.springbootmybatis.user.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;

@SpringBootTest
class SpringbootMybatisApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void contextLoads() {

    }

    @Test
    void testGetAll(){
        System.out.println(userDao.getAll(new HashMap()));
    }
}
