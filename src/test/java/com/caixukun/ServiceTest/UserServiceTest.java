package com.caixukun.ServiceTest;

import com.caixukun.ApplicationTests;
import com.weblatter.service.imple.UserMyService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

public class UserServiceTest extends ApplicationTests {
    @Autowired
    private UserMyService userMyService;

    @Test
    public void sentQuestionTest(){

    }

    @Test
    public void answerQuestionTest() throws IOException {
        userMyService.answerQuestion("00001","00000001","周林辉帅！");
    }

    @Test
    public void supportTest(){
        userMyService.support("000001");
    }

    @Test
    public void storeAnswerTest(){
        userMyService.storeAnswer("00000001","000001");
    }

    @Test
    public void storeQuestionTese(){
        userMyService.storeQuestion("00000002","00002");
    }

    @Test
    public void objectTest(){
        userMyService.object("000001");
    }

    @Test
    public void commentAnswerTest(){
        userMyService.commentAnswer("000001","00000002", "的确是这样");
    }

    @Test
    public void alterInfoTest(){
        userMyService.alterUserInfo("00000001","周林辉", "我爱学习", "123@qq.com", "123");
    }
}
