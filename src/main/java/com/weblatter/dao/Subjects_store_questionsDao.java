package com.weblatter.dao;

import com.weblatter.entity.SubjectsStoreQuestions;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface Subjects_store_questionsDao {
    @Select("SELECT * FROM SUBJECTSSTOREQUESTIONS WHERE SUBJECT_ID=#{subjectId}")
    public SubjectsStoreQuestions selectSubject(String subjectId);

    @Select("Select * FROM SUBJECTSSTOREQUESTIONS")
    public List<SubjectsStoreQuestions> selectAllSubjects();

    @Insert("INSERT INTO SUBJECTSSTOREQUESTIONS VALUES(#{subjectId}, #{questionId})")
    public void insertSubjects(SubjectsStoreQuestions subjects);

    @Delete("DELETE FROM SUBJECTSSTOREQUESTIONS WHERE SUBJECT_ID=#{subjectId}")
    public void deleteSubject(String subjectId);

    @Update("UPDATE SUBJECTSSTOREQUESTIONS SET "+
            "SUBJECT_ID=#{SUBJECT_ID},QUESTION_ID=#{QUESTION_ID}")
    public void updateInformation(SubjectsStoreQuestions subjects);
}
