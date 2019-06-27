package com.weblatter.dao;

import com.weblatter.entity.AnswersStore;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface Answers_storeDao {
    @Select("SELECT * FROM ANSWERSSTORE WHERE STORE_ID=#{storeId}")
    public AnswersStore selectStore(String storeId);

    @Select("Select * FROM ANSWERSSTORE")
    public List<AnswersStore> selectAllStores();

    @Insert("INSERT INTO ANSWERSSTORE VALUES(#{storeId},#{userId},#{answerId})")
    public void insertStores(AnswersStore stores);

    @Delete("DELETE FROM ANSWERSSTORE WHERE STORE_ID=#{storeId}")
    public void deleteStore(String storeId);

    @Update("UPDATE ANSWERSSTORE SET "+
            "STORE_ID=#{STORE_ID},USER_ID=#{USER_ID},ANSWER_ID=#{ANSWER_ID}")
    public void updateInformation(AnswersStore stores);
}
