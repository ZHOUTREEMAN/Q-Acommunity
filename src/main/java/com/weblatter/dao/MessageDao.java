package com.weblatter.dao;

import com.weblatter.entity.Messages;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface MessageDao {
    @Select("SELECT * FROM Messages WHERE message_id=#{message_id}")
    public Messages selectMessageInformation(String message_id);

    @Select("Select * FROM Messages")
    public List<Messages> selectAllMessagesInformation();

    @Insert("INSERT INTO Messages VALUES(#{message_id}, #{processing_time}, #{publisher_id}, #{message_type}, #{processing_status}, #{processing_id})")
    public void insertNewMessage(Messages messages);

    @Delete("DELETE FROM Messages WHERE message_id=#{message_id}")
    public void deleteMessage(String message_id);

    @Update("UPDATE Messages SET processing_status=#{processing_status},processing_time=#{processing_time},processing_id=#{processing_id} WHERE message_id=#{message_id}")
    public void updateMessage(Messages messages);
}
