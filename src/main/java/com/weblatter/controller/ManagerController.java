package com.weblatter.controller;

import com.alibaba.fastjson.JSON;
import com.weblatter.entity.Questions;
import com.weblatter.entity.UsersM;
import com.weblatter.service.imple.ManagerService;
import com.weblatter.service.imple.PeopleService;
import com.weblatter.service.imple.QuestionService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/manager")
public class ManagerController {
    @Autowired
    PeopleService peopleService;
    @Autowired
    ManagerService managerService;
    @Autowired
    QuestionService questionService;
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
    @GetMapping("/getprocessquestion")
    public String getProcessQuestion(){
        return JSON.toJSONString(questionService.getALLProcessQuestions());
    }
    @GetMapping("/changelabel")
    public void changeLabel(String questionID, String label){
        System.out.println(questionID);
        questionService.changeLabel(questionID, label);
    }
    @GetMapping("/banlogin")
    public void banLogin(String userId, String workerId, boolean isLogin){
        if(isLogin)
            managerService.BanLogin(userId, workerId);
        else
            managerService.LetLogin(userId);
    }
    @GetMapping("/bancomment")
    public void banComment(String userId, String workerId, boolean isComment){
        if(isComment)
            managerService.BanTalk(userId, workerId);
        else
            managerService.LetLogin(userId);
    }
}
