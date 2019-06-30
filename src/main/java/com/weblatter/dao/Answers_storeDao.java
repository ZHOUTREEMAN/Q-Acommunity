package com.weblatter.dao;

import com.weblatter.entity.AnswersStore;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface Answers_storeDao {
    @Select("SELECT * FROM ANSWERS_STORE WHERE STORE_ID=#{store_id}")
    public AnswersStore selectStore(String storeId);

    @Select("Select * FROM ANSWERS_STORE")
    public List<AnswersStore> selectAllStores();

    @Insert("INSERT INTO ANSWERS_STORE VALUES(#{store_id},#{user_id},#{answer_id})")
    public void insertStores(AnswersStore stores);

    @Delete("DELETE FROM ANSWERS_STORE WHERE STORE_ID=#{store_id}")
    public void deleteStore(String storeId);

    @Update("UPDATE ANSWERS_STORE SET "+
            "STORE_ID=#{store_id},USER_ID=#{user_id},ANSWER_ID=#{answer_id}")
    public void updateInformation(AnswersStore stores);
}
