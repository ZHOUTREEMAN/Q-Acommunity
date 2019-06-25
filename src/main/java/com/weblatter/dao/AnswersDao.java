package com.weblatter.dao;

import com.weblatter.entity.Answers;
import com.weblatter.entity.Questions;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface AnswersDao {
    @Select("SELECT * FROM ANSWERS WHERE ANSWER_ID=#{ANSWER_ID}")
    public Questions selectAnswer(String answerId);

    @Select("Select * FROM ANSWERS")
    public List<Answers> selectAllAnswers();

    @Insert("INSERT INTO ANSWERS VALUES(#{answer_Id}, #{answer_user}, #{answer_time}, #{support_num}, #{objection_num}," +
            " #{question_id}, #{answer})")
    public void insertQuestions(Answers answers);

    @Delete("DELETE FROM ANSWERS WHERE ANSWER_ID=#{ANSWER_ID}")
    public void deleteAnswers(String answerId);

    @Update("UPDATE ANSWERS SET ANSWER_USER=#{ANSWER_USER}," +
            "ANSWER_TIME=#{ANSWER_TIME},SUPPORT_NUM=#{SUPPORT_NUM},OBJECTION_NUM=#{OBJECTION_NUM}," +
            "ANSWER=#{ANSWER}")
    public void updateInformation(Answers answers);
}
