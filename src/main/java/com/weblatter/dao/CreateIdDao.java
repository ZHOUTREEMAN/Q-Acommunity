package com.weblatter.dao;

import com.weblatter.entity.Answers;
import com.weblatter.entity.IdDirectory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface CreateIdDao {
    @Select("SELECT * FROM id_directory")
    public IdDirectory selectIdDirectory();

    @Update("UPDATE id_directory SET " +
            "user_id=#{userId},worker_id=#{workerId},question_id=#{questionId},answer_id=#{answerId}," +
            "comment_id=#{commentId},Store_id=#{storeId}")
    public void updateInformation(IdDirectory idDirectory);
}
