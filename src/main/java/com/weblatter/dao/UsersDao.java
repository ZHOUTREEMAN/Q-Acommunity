package com.weblatter.dao;

import com.weblatter.entity.UsersM;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UsersDao {
    @Select("SELECT * FROM USERS_M WHERE USER_NAME=#{userName}")
    public UsersM selectUsersInformation(String userName);

    @Select("Select * FROM USERS_M")
    public List<UsersM> selectAllUsersInformation();

    @Insert("INSERT INTO USER_M VALUES(#{userId}, #{userName}, #{followersNum}, #{fansNum}, #{email}, #{personalProfile}, #{password})")
    public void insertNewUser(UsersM usersM);

    @Delete("DELETE FROM USER_M WHERE USER_NAME=#{userName}")
    public void deleteUser(String userName);

    @Update("UPDATE USERS_M SET NAME=#{userName},EMAIL=#{email},PERSONAL_PROFILE=#{personalProfile}, PASSWORD=#{password} WHERE USER_ID=#{userId}")
    public void updateInformation(UsersM usersM);
}
