package com.weblatter.dao;

import com.weblatter.entity.Questions;
import com.weblatter.entity.Workers;
import javafx.concurrent.Worker;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface WorkersDao {
    @Select("SELECT * FROM WORKERS WHERE WORKERS_ID=#{WORKERS_ID}")
    public Workers selectWorker(String WorkerId);

    @Select("Select * FROM WORKER")
    public List<Workers> selectAllWorkers();

    @Insert("INSERT INTO WORKERS VALUES(#{WORKER_ID}, #{WORKER_NAME}, #{WORKER_AGE}, #{WORKER_PHONE_NUM}, #{ID_NUMBERS}," +
            " #{EMAIL})")
    public void insertWorkers(Worker worker);

    @Delete("DELETE FROM WORKERS WHERE WORKER_ID=#{WORKER_ID}")
    public void deleteWorkers(String workerId);

    @Update({"UPDATE WORKERS SET WORKER_NAME=#{WORKER_NAME}," +
            "WORKER_AGE=#{WORKER_AGE},WORKER_PHONE_NUM=#{WORKER_PHONE_NUM},ID_NUMBERS=#{ID_NUMBERS},EMAIL=#{EMAIL}"})
    public void updateInformation(Workers workers);
}
