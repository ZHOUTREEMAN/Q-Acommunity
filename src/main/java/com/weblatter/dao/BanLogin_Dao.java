package com.weblatter.dao;

import com.weblatter.entity.BanLogin;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface BanLogin_Dao {
    //增加禁止登陆
    @Insert("INSERT INTO ban_login VALUES(#{no_login_id}, #{worker_id})")
    public void insertBanLogin(BanLogin banLogin);
    //删除禁止登陆
    @Delete("DELETE FROM ban_login WHERE no_login_id=#{user_id}")
    public void deleteBanLogin(String user_id);
    //查询某个用户是否在禁止登陆中
    @Select("SELECT * FROM ban_login WHERE no_login_id=#{user_id}")
    public BanLogin selectByUserId(String user_id);

}
