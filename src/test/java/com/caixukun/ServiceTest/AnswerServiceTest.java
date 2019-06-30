package com.caixukun.ServiceTest;

import com.caixukun.ApplicationTests;
import com.weblatter.entity.UsersM;
import com.weblatter.service.imple.AnswerService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class AnswerServiceTest extends ApplicationTests {
    @Autowired
    AnswerService answerService;

    @Test
    public void getAnswerUserInformationTest (){
        List <UsersM> u = new ArrayList<UsersM>();
        u=answerService.getAnswerUserInformation("00001");
        for(int i=0;i<u.size();i++)
        {
            UsersM a=u.get(i);
            System.out.println(a.getUser_id()+"  "+a.getUserName());
        }
    }
}
