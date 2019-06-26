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
    @Select("SELECT * FROM WORKERS WHERE WORKERS_ID=#{workers_id}")
    public Workers selectWorker(String WorkerId);

    @Select("Select * FROM WORKER")
    public List<Workers> selectAllWorkers();

    @Insert("INSERT INTO WORKERS VALUES(#{worker_id}, #{worker_name}, #{worker_age}," +
            " #{worker_phone_num}, #{id_numbers}," +
            " #{email})")
    public void insertWorkers(Workers worker);

    @Delete("DELETE FROM WORKERS WHERE WORKER_ID=#{worker_id}")
    public void deleteWorkers(String workerId);

    @Update({"UPDATE WORKERS SET WORKER_NAME=#{worker_name}," +
            "WORKER_AGE=#{worker_age},WORKER_PHONE_NUM=#{worker_phone_num},ID_NUMBERS=#{id_numbers},EMAIL=#{email}"})
    public void updateInformation(Workers workers);
}
