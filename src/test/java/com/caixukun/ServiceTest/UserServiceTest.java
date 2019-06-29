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
        userMyService.sendQuestion("周林辉帅吗？1","周林辉帅吗？2", 10, "00000001", "生活");
    }

    @Test
    public void answerQuestionTest(){
        userMyService.answerQuestion("00001","00000002","周林辉帅！");
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
}
