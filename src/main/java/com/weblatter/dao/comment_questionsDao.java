package com.weblatter.dao;

import com.weblatter.entity.CommentQuestions;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface comment_questionsDao {
    @Select("SELECT * FROM COMMENTQUESTIONS WHERE COMMENT_ID=#{commentId}")
    public CommentQuestions selectComment(String commentId);

    @Select("Select * FROM COMMENTQUESTIONS")
    public List<CommentQuestions> selectAllComments();

    @Insert("INSERT INTO COMMENTQUESTIONS VALUES(#{commentId},#{comment},#{questionId})")
    public void insertComments(CommentQuestions comments);

    @Delete("DELETE FROM COMMENTQUESTIONS WHERE COMMENT_ID=#{commentId}")
    public void deleteComment(String commentId);

    @Update("UPDATE COMMENTQUESTIONS SET "+
            "COMMENT_ID=#{COMMENT_ID},COMMENT=#{COMMENT},QUESTION_ID=#{QUESTION_ID}")
    public void updateInformation(CommentQuestions comments);
}
