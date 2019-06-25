package com.weblatter.dao;

import com.weblatter.entity.Questions;
import com.weblatter.entity.Workers;
import javafx.concurrent.Worker;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface WorkersDao {
    @Select("SELECT * FROM WORKERS WHERE WORKERS_ID=#{workersId}")
    public Workers selectWorker(String WorkerId);

    @Select("Select * FROM WORKER")
    public List<Workers> selectAllWorkers();

    @Insert("INSERT INTO WORKERS VALUES(#{workerId}, #{workerName}, #{workerAge}, #{workerPhoneNum}, #{idNumbers}," +
            " #{email})")
    public void insertWorkers(Workers worker);

    @Delete("DELETE FROM WORKERS WHERE WORKER_ID=#{workerId}")
    public void deleteWorkers(String workerId);

    @Update({"UPDATE WORKERS SET WORKER_NAME=#{workerName}," +
            "WORKER_AGE=#{workerAge},WORKER_PHONE_NUM=#{workerPhoneNum},ID_NUMBERS=#{idNumbers},EMAIL=#{email}"})
    public void updateInformation(Workers workers);
}
