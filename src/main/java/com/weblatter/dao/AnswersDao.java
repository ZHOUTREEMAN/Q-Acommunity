package com.weblatter.dao;

import com.weblatter.entity.Answers;
import com.weblatter.entity.Questions;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface AnswersDao {
    @Select("SELECT * FROM ANSWERS WHERE ANSWER_ID=#{answerId}")
    public Answers selectAnswer(String answerId);

    @Select("Select * FROM ANSWERS")
    public List<Answers> selectAllAnswers();

    @Insert("INSERT INTO ANSWERS VALUES(#{answerId}, #{answerUser}, #{answerTime}, #{supportNum}, #{objectionNum}," +
            " #{questionId}, #{answer})")
    public void insertQuestions(Answers answers);

    @Delete("DELETE FROM ANSWERS WHERE ANSWER_ID=#{answerId}")
    public void deleteAnswers(String answerId);

    @Update("UPDATE ANSWERS SET ANSWER_USER=#{answerUser}," +
            "ANSWER_TIME=#{answerTime},SUPPORT_NUM=#{supportNum},OBJECTION_NUM=#{objectionNum}," +
            "ANSWER=#{answer}")
    public void updateInformation(Answers answers);
}
