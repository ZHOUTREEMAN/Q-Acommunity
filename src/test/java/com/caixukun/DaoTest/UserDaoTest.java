package com.caixukun.DaoTest;

import com.caixukun.ApplicationTests;
import com.weblatter.dao.UsersDao;
import com.weblatter.entity.UsersM;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;


public class UserDaoTest extends ApplicationTests {
    @Autowired
    private UsersDao usersDaoTest;
    @Test
    public void insertTest(){
        UsersM usersM = new UsersM();
        usersM.setUserId("wddwedw");
        usersM.setUserName("miserman");
        usersM.setPersonalProfile("http://323.423.4234.34");
        usersM.setPassword("123456");
        usersM.setFollowersNum(12);
        usersM.setFansNum(43);
        usersDaoTest.insertNewUser(usersM);
    }
}
