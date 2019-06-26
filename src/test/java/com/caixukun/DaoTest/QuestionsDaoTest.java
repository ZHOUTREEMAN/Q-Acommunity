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
        questions.setAnswer_num(10);
        questions.setComplement("lalal");
        questions.setIntegral(10);
        questions.setLabel_m("高考");
        questions.setQuestion("高考难吗？");
        questions.setQuestion_following_num(10);
        questions.setQuestion_id("00005");
        questions.setQuestion_status("已回答");
        questions.setQuestion_time(new Date(2019, 0, 1));
        questions.setUser_id("00000003");

        questionsDao.insertQuestions(questions);

    }
}
