package com.caixukun;

import com.weblatter.ServerApplication;
import com.weblatter.dao.UsersDao;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootTest(classes = ServerApplication.class)
@RunWith(SpringRunner.class)

public class ApplicationTests {

    @Before
    public void init() {
        System.out.println("开始测试-----------------");

    }
    @After
    public void after() {

        System.out.println("测试结束-----------------");
    }
}
