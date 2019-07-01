package com.weblatter.controller;

import com.alibaba.fastjson.JSON;
import com.weblatter.entity.UsersM;
import com.weblatter.service.imple.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/manager")
public class ManagerController {
    @Autowired
    PeopleService peopleService;

    @GetMapping("/showusers")
    public String getAllUsers(){
        List<UsersM>usersMList = peopleService.selectAllUsers();
        return JSON.toJSONString(usersMList);
    }
    @GetMapping("/updatepassword")
    public void updatePd(String userName, String email, String password){
        peopleService.updateUserInformation(userName, userName, email, password);
    }
    @GetMapping("/deleteuser")
    public void deleteUser(String userName){
        peopleService.deleteUserFromSystem(userName);
    }
}
