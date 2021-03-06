package com.weblatter.dao;

import com.weblatter.entity.UsersM;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UsersDao {

    @Select("SELECT * FROM USERS_M WHERE USER_NAME=#{user_name}")
//    @Results({
//            @Result(column = "user_id", property = "userId", jdbcType = JdbcType.CHAR, id = true),
//            @Result(column = "user_name", property = "userName", jdbcType = JdbcType.VARCHAR),
//            @Result(column = "followers_num", property = "followersNum", jdbcType = JdbcType.INTEGER),
//            @Result(column = "fans_num", property = "fansNum", jdbcType = JdbcType.VARCHAR),
//            @Result(column = "email", property = "email", jdbcType = JdbcType.VARCHAR),
//            @Result(column = "personal_profile", property = "personalProfile", jdbcType = JdbcType.VARCHAR),
//            @Result(column = "password", property = "password", jdbcType = JdbcType.VARCHAR)
//    })
    public UsersM selectUsersInformation(String userName);

    @Select("SELECT * FROM USERS_M WHERE USER_ID=#{user_id}")
    public UsersM selectUsersInformation2(String user_id);

    @Select("Select * FROM USERS_M")
    public List<UsersM> selectAllUsersInformation();
    //INSERT INTO Users_m VALUES('00000004','儿子',1,1,'173@qq.com','阿里清洁工',0,'123456');

    @Insert("INSERT INTO USERS_M VALUES(#{user_id},#{user_name},#{followers_num},#{fans_num},#{email},#{personal_profile},#{integral},#{password})")
    public void insertNewUser(UsersM usersM);

    @Delete("DELETE FROM USERS_M WHERE USER_NAME=#{user_name}")
    public void deleteUser(String userName);

    @Update("UPDATE USERS_M SET USER_NAME=#{user_name},EMAIL=#{email},PERSONAL_PROFILE=#{personal_profile}, PASSWORD=#{password},PERSONAL_PROFILE=#{personal_profile} WHERE USER_ID=#{user_id}")
    public void updateInformation(UsersM usersM);

    @Select("SELECT user_id from users_m where user_name=#{user_name}")
    public String selectUserIdByName(String user_name);
}
