package com.caixukun.DaoTest;

import com.caixukun.ApplicationTests;
import com.weblatter.dao.UsersDao;
import com.weblatter.entity.UsersM;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Slf4j
public class UserDaoTest extends ApplicationTests {
    @Autowired
    private UsersDao usersDaoTest;
    @Test
    public void selectUserTest(){
        UsersM usersM = usersDaoTest.selectUsersInformation("wangzi");
        System.out.println(usersM.getPassword());
    }
    @Test
    public void insertTest(){
        UsersM usersM = new UsersM();
        usersM.setUser_id("wddwedw");
        usersM.setUserName("miserman");
        usersM.setPersonal_profile("http://323.423.4234.34");
        usersM.setPassword("123456");
        //usersM.setFollowersnum(12);
        usersM.setFans_num(43);
        usersDaoTest.insertNewUser(usersM);
    }

    @Test
    public void selectTest(){
        List<UsersM>usersMList = usersDaoTest.selectAllUsersInformation();
        for(UsersM usersM : usersMList)
            System.out.println(usersM.getUserName());
    }

    @Test
    public void deleteTest(){
        usersDaoTest.deleteUser("miserman");//删除上文插入的数据
    }

    @Test
    public void update(){
        UsersM usersM = new UsersM();
        usersM.setUser_id("wddwedw");
        usersM.setUserName("wangmuxin");
        usersM.setPersonal_profile("http://323.423.4234.34");
        usersM.setPassword("432342");
        //usersM.setFollowersnum(12);
        usersM.setFans_num(43);
        usersDaoTest.updateInformation(usersM);
    }
}
