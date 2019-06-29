package com.caixukun.ServiceTest;

import com.caixukun.ApplicationTests;
import com.weblatter.dao.QuestionsDao;
import com.weblatter.entity.Answers;
import com.weblatter.service.imple.QuestionService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class QuestionServiceTest extends ApplicationTests {
    @Autowired
    private QuestionService questionService;
    @Test
    public void getAnswersTest(){
        List<Answers> answersList = questionService.getAnswers("00001", 10);
        for (Answers answers :answersList) {
            System.out.println(answers.getAnswer_id());
        }

    }
}
