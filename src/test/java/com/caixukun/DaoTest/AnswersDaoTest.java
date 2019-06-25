package com.caixukun.DaoTest;

import com.caixukun.ApplicationTests;
import com.weblatter.dao.AnswersDao;
import com.weblatter.dao.UsersDao;
import com.weblatter.entity.Answers;
import com.weblatter.entity.UsersM;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Date;

public class AnswersDaoTest extends ApplicationTests {
    @Autowired
    private AnswersDao answersDao;
    @Test
    public void insertTest(){
        Answers answers=new Answers();
        answers.setAnswerId("000004");
        answers.setAnswer("lalalsfa");
        answers.setAnswerTime(new Date(1, 1, 23));
        answers.setAnswerUser("00000001");
        answers.setQuestionId("00001");
        answers.setSupportNum(12);
        answers.setObjectionNum(1);
        answersDao.insertQuestions(answers);

    }
}
