package com.weblatter.dao;

import com.weblatter.entity.Questions;
import com.weblatter.entity.UsersM;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface QuestionsDao {
    @Select("SELECT * FROM QUESTIONS WHERE QUESTION_ID=#{question_id}")
    public Questions selectQuestion(String question_id);

    @Select("Select * FROM QUESTIONS")
    public List<Questions> selectAllQuestions();

    @Insert("INSERT INTO QUESTIONS VALUES(#{question_id}, #{user_id}, #{question_time}, #{question}," +
            " #{complement}, #{label_m},#{integral},#{answer_num},#{question_following_num},#{processing_status},#{processing_id})")
    public void insertQuestions(Questions questions);

    @Delete("DELETE FROM QUESTIONS WHERE QUESTION_ID=#{question_id}")
    public void deleteQuestion(String question_id);

    @Update("UPDATE QUESTIONS SET "+
            "QUESTION_TIME=#{question_time},PROCESSING_STATUS=#{processing_status},QUESTION=#{question}," +
            "COMPLEMENT=#{complement},LABEL_M=#{label_m},INTEGRAL=#{integral},ANSWER_NUM=#{answer_num}," +
            "QUESTION_FOLLOWING_NUM=#{question_following_num},PROCESSING_ID=#{processing_id} WHERE QUESTION_ID=#{question_id}")
    public void updateInformation(Questions questions);
}
