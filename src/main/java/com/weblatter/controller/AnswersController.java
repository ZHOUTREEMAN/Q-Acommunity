package com.weblatter.controller;


import com.weblatter.service.imple.UserMyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/answer")
public class AnswersController {
    @Autowired
    UserMyService userMyService;

    //html标签，然后存起来
    @GetMapping("/commitanswer")
    public void commitAnswerToManager(String html_text, String questionID, String userID) throws IOException {
        userMyService.answerQuestion(questionID, userID, html_text);
    }
}
