package com.weblatter.dao;

import com.weblatter.entity.QuestionsFollowing;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface Questions_followingDao {
    @Select("SELECT * FROM Questions_following WHERE user_n=#{user_n}")
    public List<QuestionsFollowing> selectFollowQuestions(String userN);//查看用户关注的问题

    @Select("SELECT * FROM Questions_following WHERE question=#{ques}")
    public List<QuestionsFollowing> selectFollowedQuestionsUser(String ques);//查看关注此问题的用户

    @Insert("INSERT INTO Questions_following VALUES(#{user_n}, #{question})")
    public void insertNewQuestionsFollowing(QuestionsFollowing questionsfollowing);//新增关注关系

    @Delete("DELETE FROM Questions_following WHERE user_n=#{user_n} and question=#{question}")
    public void deleteQuestionsFollowing(QuestionsFollowing questionsfollowing);//删除关注关系
}
