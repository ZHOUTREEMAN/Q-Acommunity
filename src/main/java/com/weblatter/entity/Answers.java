package com.weblatter.entity;


public class Answers extends Inspect {

  private String answer_id;
  private String answer_user;
  private java.sql.Date answer_time;
  private long support_num;
  private long objection_num;
  private String question_id;
  private String answer;
  private String processing_status;
  private String processing_id;


  public String getAnswer_id() {
    return answer_id;
  }

  public void setAnswer_id(String answer_id) {
    this.answer_id = answer_id;
  }


  public String getAnswer_user() {
    return answer_user;
  }

  public void setAnswer_user(String answer_user) {
    this.answer_user = answer_user;
  }


  public java.sql.Date getAnswer_time() {
    return answer_time;
  }

  public void setAnswer_time(java.sql.Date answer_time) {
    this.answer_time = answer_time;
  }


  public long getSupport_num() {
    return support_num;
  }

  public void setSupport_num(long support_num) {
    this.support_num = support_num;
  }


  public long getObjection_num() {
    return objection_num;
  }

  public void setObjection_num(long objection_num) {
    this.objection_num = objection_num;
  }


  public String getQuestion_id() {
    return question_id;
  }

  public void setQuestion_id(String question_id) {
    this.question_id = question_id;
  }


  public String getAnswer() {
    return answer;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }


  public String getProcessing_status() {
    return processing_status;
  }

  public void setProcessing_status(String processing_status) {
    this.processing_status = processing_status;
  }


  public String getProcessing_id() {
    return processing_id;
  }

  public void setProcessing_id(String processing_id) {
    this.processing_id = processing_id;
  }

}
