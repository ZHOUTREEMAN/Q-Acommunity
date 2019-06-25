package com.weblatter.dao;

import com.weblatter.entity.Questions;
import com.weblatter.entity.UsersM;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface QuestionsDao {
    @Select("SELECT * FROM QUESTIONS WHERE QUESTION_ID=#{QUESTION_ID}")
    public Questions selectQuestion(String questionId);

    @Select("Select * FROM QUESTIONS")
    public List<Questions> selectAllQuestions();

    @Insert("INSERT INTO QUESTIONS VALUES(#{QUESTION_ID}, #{USER_ID}, #{QUESTION_TIME}, #{QUESTION_STATUS}, #{QUESTION}," +
            " #{COMPLEMENT}, #{LABEL_M},#{INTEGRAL},#{ANSWER_NUM},#{QUESTION_FOLLOWING_NUM})")
    public void insertQuestions(Questions questions);

    @Delete("DELETE FROM QUESTIONS WHERE QUESTION_ID=#{QUESTION_ID}")
    public void deleteQuestion(String questionId);

    @Update("UPDATE QUESTIONS SET "+
            "QUESTION_TIME=#{QUESTION_TIME},QUESTION_STATUS=#{QUESTION_STATUS},QUESTION=#{QUESTION}," +
            "COMPLEMENT=#{COMPLEMENT},LABEL_M=#{LABEL_M},INTEGRAL=#{INTEGRAL},ANSWER_NUM=#{ANSWER_NUM}," +
            "QUESTION_FOLLOWING_NUM=#{QUESTION_FOLLOWING_NUM}")
    public void updateInformation(Questions questions);
}
