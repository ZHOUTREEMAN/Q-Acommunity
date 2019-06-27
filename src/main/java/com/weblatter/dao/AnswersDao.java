package com.weblatter.dao;

import com.weblatter.entity.Answers;
import com.weblatter.entity.Questions;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface AnswersDao {
    @Select("SELECT * FROM ANSWERS WHERE answer_id=#{answer_id}")
    public Answers selectAnswer(String answer_id);

    @Select("Select * FROM ANSWERS")
    public List<Answers> selectAllAnswers();

    @Insert("INSERT INTO ANSWERS VALUES(#{answer_id}, #{answer_user}, #{answer_time}, #{support_num}, #{objection_num}," +
            " #{question_id}, #{answer},#{processing_status},#{processing_id})")
    public void insertQuestions(Answers answers);

    @Delete("DELETE FROM ANSWERS WHERE ANSWER_ID=#{answer_id}")
    public void deleteAnswers(String answer_id);

    @Update("UPDATE ANSWERS SET " +
            "ANSWER_TIME=#{answer_time},SUPPORT_NUM=#{support_num},OBJECTION_NUM=#{objection_num}," +
            "ANSWER=#{answer},PROCESSING_STATUS=#{processing_status},PROCESSING_ID=#{processing_id} WHERE ANSWER_ID=#{answer_id} ")
    public void updateInformation(Answers answers);
}
