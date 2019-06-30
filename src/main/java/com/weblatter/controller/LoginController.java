package com.weblatter.controller;

import com.alibaba.fastjson.JSON;
import com.weblatter.entity.UsersM;
import com.weblatter.service.imple.PeopleService;
import com.weblatter.util.Information;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/identify")
public class LoginController {
    @Autowired
    PeopleService peopleService;

    @GetMapping("/h")
    public String t(){
        return "cdscscsd";
    }
    @GetMapping("/sign/complete")
    public void signUser(String userName, String password){
        peopleService.UserRegister(userName, password);
    }

    @GetMapping("/sign/validate")
    public String isHaveUserName(String userName){
        UsersM usersM = peopleService.getUsersInformation(userName);
        Information<Boolean>info = new Information<Boolean>(null, null);
        if(usersM == null)
            info.setMainData(true);
        else
            info.setMainData(false);
        return JSON.toJSONString(info);
    }

    @RequestMapping("/vali")
    public String validateUser(String userName, String password){
        Information<UsersM> info = peopleService.validateSignIn(userName, password);
        return JSON.toJSONString(info);
    }
}
