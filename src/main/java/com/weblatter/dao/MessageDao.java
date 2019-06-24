package com.weblatter.dao;

import com.weblatter.entity.Messages;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface MessageDao {
    @Select("SELECT * FROM Messages WHERE message_id=#{messageId}")
    public Messages selectMessageInformation(String messageId);

    @Select("Select * FROM Messages")
    public List<Messages> selectAllMessagesInformation();

    @Insert("INSERT INTO Messages VALUES(#{message_id}, #{processing_time}, #{publisher_id}, #{message_type}, #{processing_status}, #{processing_id})")
    public void insertNewMessage(Messages messages);

    @Delete("DELETE FROM Messages WHERE message_id=#{messageId}")
    public void deleteMessage(String messageId);

    @Update("UPDATE Messages SET processing_status=#{processingStatus},processing_time=#{processingTime},processing_id=#{processingId} WHERE message_id=#{messageId}")
    public void updateMessage(Messages messages);
}
