package com.weblatter.dao;

import com.weblatter.entity.CommentQuestions;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface comment_questionsDao {
    @Select("SELECT * FROM COMMENTQUESTIONS WHERE COMMENT_ID=#{comment_id}")
    public CommentQuestions selectComment(String comment_id);

    @Select("Select * FROM COMMENTQUESTIONS")
    public List<CommentQuestions> selectAllComments();

    @Insert("INSERT INTO COMMENTQUESTIONS VALUES(#{comment_id},#{comment},#{question_id})")
    public void insertComments(CommentQuestions commentquestions);

    @Delete("DELETE FROM COMMENTQUESTIONS WHERE COMMENT_ID=#{comment_id}")
    public void deleteComment(String comment_id);

    @Update("UPDATE COMMENTQUESTIONS SET "+
            "COMMENT=#{COMMENT},QUESTION_ID=#{QUESTION_ID} WHERE COMMENT_ID=#{comment_id}")
    public void updateInformation(CommentQuestions commentquestions);
}
