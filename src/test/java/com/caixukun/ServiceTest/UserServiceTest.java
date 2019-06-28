package com.caixukun.ServiceTest;

import com.caixukun.ApplicationTests;
import com.weblatter.service.imple.UserMyService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceTest extends ApplicationTests {
    @Autowired
    private UserMyService userMyService;

    @Test
    public void sentQuestionTest(){
        userMyService.sendQuestion("周兴帅吗？1","周兴帅吗？2", 10, "00000001", "生活");
    }

    @Test
    public void answerQuestionTest(){
        userMyService.answerQuestion("10000","00000002","周林辉帅！");
    }

    @Test
    public void supportTest(){
        userMyService.support("100000");
    }

    @Test
    public void storeAnswerTest(){
        userMyService.storeAnswer("00000001","100000");
    }
}
