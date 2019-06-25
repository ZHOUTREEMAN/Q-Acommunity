package com.caixukun.DaoTest;

import com.caixukun.ApplicationTests;
import com.weblatter.dao.AnswersDao;
import com.weblatter.dao.QuestionsDao;
import com.weblatter.entity.Questions;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Date;

public class QuestionsDaoTest extends ApplicationTests {
    @Autowired
    private QuestionsDao questionsDao;
    @Test
    public void insertTest(){
        Questions questions=new Questions();
        questions.setAnswerNum(10);
        questions.setComplement("lalal");
        questions.setIntegral(10);
        questions.setLabelM("高考");
        questions.setQuestion("高考难吗？");
        questions.setQuestionFollowingNum(10);
        questions.setQuestionId("00005");
        questions.setQuestionStatus("已回答");
        questions.setQuestionTime(new Date(2019, 0, 1));
        questions.setUserId("00000003");

        questionsDao.insertQuestions(questions);

    }
}
