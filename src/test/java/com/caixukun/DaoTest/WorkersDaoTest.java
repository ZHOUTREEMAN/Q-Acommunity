package com.caixukun.DaoTest;

import com.caixukun.ApplicationTests;
import com.weblatter.dao.AnswersDao;
import com.weblatter.dao.WorkersDao;
import com.weblatter.entity.Workers;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class WorkersDaoTest extends ApplicationTests {
    @Autowired
    private WorkersDao workersDao;
    @Test
    public void insertTest(){
        Workers workers=new Workers();
        workers.setEmail("123@qq.com");
        workers.setIdNumbers("001");
        workers.setWorkerAge(18);
        workers.setWorkerId("00000006");
        workers.setWorkerName("zhou");
        workers.setWorkerPhoneNum("18581376626");

        workersDao.insertWorkers(workers);
//        Answers answers=new Answers();
//        answers.setAnswerId("000004");
//        answers.setAnswer("lalalsfa");
//        answers.setAnswerTime(new Date(1, 1, 23));
//        answers.setAnswerUser("00000001");
//        answers.setQuestionId("00001");
//        answers.setSupportNum(12);
//        answers.setObjectionNum(1);
//        answersDao.insertQuestions(answers);

    }
}
