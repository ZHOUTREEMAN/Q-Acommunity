package com.weblatter.controller;

import com.alibaba.fastjson.JSON;
import com.weblatter.dao.QuestionsDao;
import com.weblatter.entity.Questions;
import com.weblatter.service.imple.QuestionService;
import com.weblatter.service.imple.UserMyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.List;


@RestController
@RequestMapping("/query")
public class QuestionsController {
    @Autowired
    UserMyService userMyService;
    @Autowired
    QuestionService questionService;
    @GetMapping("/commit")
    public void commit(String question, String userID, int q_score, String label_m, String complement){
        userMyService.sendQuestion(question, q_score, userID, label_m, complement);
    }
    @GetMapping("/gethotquestionlist")
    public String getHotQuestionList(int num){
        List<Questions>questions = questionService.getCommonQuestions();
        return null;
    }
    @GetMapping("/getquestionlist")
    public String getCommonList(){
        List<Questions>questions = questionService.getCommonQuestions();
        return JSON.toJSONString(questions);
    }
    @GetMapping("/getallquestions")
    public String getAllQuestions(){
        List<Questions>questions = questionService.getAllQuestion();
        return JSON.toJSONString(questions);
    }
}
