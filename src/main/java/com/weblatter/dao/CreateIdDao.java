package com.weblatter.dao;

import com.weblatter.entity.IdDirectory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface CreateIdDao {
    @Select("SELECT * FROM ID_DIRECTORY")
    public IdDirectory selectIdDirectory(String store_id);

    @Update("UPDATE id_directory SET " +
            "user_id=#{user_id},worker_id=#{worker_id},question_id=#{question_id},answer_id=#{answer_id}," +
            "comment_id=#{comment_id},Store_id=#{store_id}")
    public void updateInformation(IdDirectory idDirectory);
}
