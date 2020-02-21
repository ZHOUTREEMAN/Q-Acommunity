package com.caixukun.DaoTest;

import com.caixukun.ApplicationTests;
import com.weblatter.dao.AnswersDao;
import com.weblatter.dao.QuestionsDao;
import com.weblatter.entity.Questions;
import com.weblatter.entity.UsersM;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Date;
import java.util.List;

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
        questions.setQuestion_id("00004");
        //questions.setQuestion_status("已回答");
        questions.setQuestion_time(new Date(2019, 0, 1));
        questions.setUser_id("00000003");
        questionsDao.insertQuestions(questions);
    }
    @Test
    public void selectTest(){
        List<Questions> questionsList=questionsDao.selectAllQuestions();
        for (Questions questions :questionsList) {
            System.out.println(questions.getAnswer_num());
        }
    }

    @Test
    public void deleteTest(){
        questionsDao.deleteQuestion("00004");
    }

    @Test
    public void updateTest(){
        Questions questions=new Questions();
        questions.setAnswer_num(10);
        questions.setComplement("lalal");
        questions.setIntegral(10);
        questions.setLabel_m("高考");
        questions.setQuestion("高考难吗？");
        questions.setQuestion_following_num(10);
        //questions.setQuestion_status("已回答");
        questions.setQuestion_time(new Date(2019, 0, 1));

        questionsDao.updateInformation(questions);
    }
    @Test
    public void setLbelTest(){
        Questions id = questionsDao.selectQuestion("00003");
        System.out.println(id.getQuestion());
    }
}
