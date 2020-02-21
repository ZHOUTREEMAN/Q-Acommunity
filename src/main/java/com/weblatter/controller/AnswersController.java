package com.weblatter.controller;


import com.alibaba.fastjson.JSON;
import com.weblatter.entity.Answers;
import com.weblatter.entity.Questions;
import com.weblatter.service.imple.AnswerService;
import com.weblatter.service.imple.QuestionService;
import com.weblatter.service.imple.UserMyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/answer")
public class AnswersController {
    @Autowired
    UserMyService userMyService;
    @Autowired
    QuestionService questionService;
    //html标签，然后存起来
    @GetMapping("/commitanswer")
    public void commitAnswerToManager(String html_text, String questionID, String userID) throws IOException {
        userMyService.answerQuestion(questionID, userID, html_text);
    }

    @GetMapping("/findanswer")
    public String findAnswer(String questionId){
        List<Answers> questionsList = questionService.getAnswers(questionId, 10);
        return JSON.toJSONString(questionsList);
    }
}
