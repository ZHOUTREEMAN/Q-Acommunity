package com.caixukun.ServiceTest;

import com.caixukun.ApplicationTests;
import com.weblatter.service.imple.PeopleService;
import com.weblatter.util.Information;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class PeopleServiceTest extends ApplicationTests {
    @Autowired
    PeopleService peopleService;

    @Test
    public void updateTest(){
        Information<?>information = peopleService.updateUserInformation("wangzi", "wangzi", "323@qq.com", "3423243234");
        System.out.println(information.getTip());
    }
}
