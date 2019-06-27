package com.weblatter.dao;

import com.weblatter.entity.UsersFollowing;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface Users_followingDao {
    @Select("SELECT * FROM Users_following WHERE follow=#{follow_user}")
    public List<UsersFollowing> selectUserFollowInformation(String followUser);//查询用户关注的信息

    @Select("SELECT * FROM Users_following WHERE be_followed=#{followed_user}")
    public List<UsersFollowing> selectUserFollowedInformation(String followedUser);//查询用户的粉丝信息

    @Insert("INSERT INTO Users_following VALUES(#{follow}, #{be_followed})")
    public void insertNewUserFollowing(UsersFollowing usersfollowing);//新建关注关系

    @Delete("DELETE FROM Users_following WHERE follow=#{follow_user} and be_followed=#{followed_user}")
    public void deleteUserFollowing(UsersFollowing usersFollowing);//删除关注关系
}
