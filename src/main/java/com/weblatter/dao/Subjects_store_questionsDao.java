package com.weblatter.dao;

import com.weblatter.entity.SubjectsStoreQuestions;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface Subjects_store_questionsDao {
    @Select("SELECT * FROM Subjects_store_questions WHERE SUBJECT_ID=#{subject_id}")
    public SubjectsStoreQuestions selectSubject(String subject_id);

    @Select("Select * FROM Subjects_store_questions")
    public List<SubjectsStoreQuestions> selectAllSubjects();

    @Insert("INSERT INTO Subjects_store_questions VALUES(#{subject_id}, #{question_id})")
    public void insertSubjects(SubjectsStoreQuestions subjects);

    @Delete("DELETE FROM Subjects_store_questions WHERE SUBJECT_ID=#{subject_id}")
    public void deleteSubject(String subject_id);

    @Update("UPDATE Subjects_store_questions SET "+
            "SUBJECT_ID=#{subject_id},QUESTION_ID=#{question_id}")
    public void updateInformation(SubjectsStoreQuestions subjects);
}
