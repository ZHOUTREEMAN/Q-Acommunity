package com.weblatter.dao;

import com.weblatter.entity.AnswersStore;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface Answers_storeDao {
    @Select("SELECT * FROM ANSWERSSTORE WHERE STORE_ID=#{store_id}")
    public AnswersStore selectStore(String store_id);

    @Select("Select * FROM ANSWERSSTORE")
    public List<AnswersStore> selectAllStores();

    @Insert("INSERT INTO ANSWERSSTORE VALUES(#{store_id},#{user_id},#{answer_id})")
    public void insertStores(AnswersStore answersStore);

    @Delete("DELETE FROM ANSWERSSTORE WHERE STORE_ID=#{store_id}")
    public void deleteStore(String store_id);

//    @Update("UPDATE ANSWERSSTORE SET "+
//            "USER_ID=#{USER_ID},ANSWER_ID=#{ANSWER_ID} where STORE")
//    public void updateInformation(AnswersStore answersStore);
}
