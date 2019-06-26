package com.caixukun.DaoTest;

import com.caixukun.ApplicationTests;
import com.weblatter.dao.AnswersDao;
import com.weblatter.dao.UsersDao;
import com.weblatter.entity.Answers;
import com.weblatter.entity.UsersM;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sound.midi.Soundbank;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class AnswersDaoTest extends ApplicationTests {
    @Autowired
    private AnswersDao answersDao;
    @Test
    public void insertTest(){
        Answers answers=new Answers();
        answers.setAnswer_id("000004");
        answers.setAnswer("lalalsfa");
        answers.setAnswer_time(new Date(1, 1, 23));
        answers.setAnswer_user("00000001");
        answers.setQuestion_id("00001");
        answers.setSupport_num(12);
        answers.setObjection_num(1);

        answersDao.insertQuestions(answers);
    }

    @Test
    public void selectTest(){
        List<Answers> answersList=answersDao.selectAllAnswers();
        for (Answers answers :answersList) {
            System.out.println(answers.getAnswer_id());
        }
    }

    @Test
    public void deleteTest(){
        answersDao.deleteAnswers("000004");
    }

    @Test
    public void updateTest(){
        Answers answers=new Answers();
        answers.setAnswer_id("000004");
        answers.setAnswer("更新");
        answers.setAnswer_time(new Date(1, 1, 23));
        answers.setAnswer_user("00000001");
        answers.setQuestion_id("00001");
        answers.setSupport_num(12);
        answers.setObjection_num(1);

        answersDao.updateInformation(answers);
    }
}
