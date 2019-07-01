package com.weblatter.dao;

import com.weblatter.entity.BanTalk;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface BanTalk_Dao {
    //增加禁言
    @Insert("INSERT INTO ban_talk VALUES(#{no_talk_id}, #{work_id})")
    public void insertBanTalk(BanTalk banTalk);
    //删除禁言
    @Delete("DELETE FROM ban_talk WHERE no_talk_id=#{user_id}")
    public void deleteBanTalk(String user_id);
    //查询某个用户是否在禁言名单中
    @Select("SELECT * FROM ban_talk WHERE no_talk_id=#{user_id}")
    public BanTalk selectByUserId(String user_id);
}
