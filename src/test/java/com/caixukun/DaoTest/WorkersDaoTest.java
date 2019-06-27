package com.caixukun.DaoTest;

import com.caixukun.ApplicationTests;
import com.weblatter.dao.AnswersDao;
import com.weblatter.dao.WorkersDao;
import com.weblatter.entity.Workers;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class WorkersDaoTest extends ApplicationTests {
    @Autowired
    private WorkersDao workersDao;
    @Test
    public void insertTest(){
        Workers workers=new Workers();
        workers.setEmail("123@qq.com");
        workers.setIdNumbers("001");
        workers.setWorker_age(18);
        workers.setWorker_id("00000006");
        workers.setWorker_name("zhou");
        workers.setWorker_phone_num("18581376626");

        workersDao.insertWorkers(workers);
    }

    @Test
    public void selectTest(){
        List<Workers> workersList=workersDao.selectAllWorkers();
        for (Workers workers :workersList) {
            System.out.println(workers.getWorker_id());
        }

    }


    @Test
    public void deleteTest(){
        workersDao.deleteWorkers("00000006");
    }

    @Test
    public void updateTest(){
        Workers workers=new Workers();
        workers.setEmail("123@qq.com");
        workers.setIdNumbers("001");
        workers.setWorker_age(18);
        workers.setWorker_id("00000006");
        workers.setWorker_name("zhou");
        workers.setWorker_phone_num("18581376626");

        workersDao.updateInformation(workers);
    }
}
