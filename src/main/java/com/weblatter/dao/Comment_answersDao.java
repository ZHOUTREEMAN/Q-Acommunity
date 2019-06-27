package com.weblatter.dao;

import com.weblatter.entity.CommentAnswer;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface Comment_answersDao {
    @Select("SELECT * FROM comment_answers WHERE COMMENT_ID=#{comment_id}")
    public CommentAnswer selectComment(String comment_id);

    @Select("Select * FROM comment_answers")
    public List<CommentAnswer> selectAllComments();

    @Insert("INSERT INTO comment_answers VALUES(#{comment_id},#{comment},#{answer_id})")
    public void insertComments(CommentAnswer commentAnswer);

    @Delete("DELETE FROM comment_answers WHERE COMMENT_ID=#{comment_id}")
    public void deleteComment(String comment_id);

    @Update("UPDATE comment_answers SET "+
            "COMMENT=#{comment},ANSWER_ID=#{answer_id} WHERE COMMENT_ID=#{comment_id}")
    public void updateInformation(CommentAnswer commentAnswer);
}
