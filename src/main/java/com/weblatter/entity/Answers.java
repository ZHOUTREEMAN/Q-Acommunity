package com.weblatter.entity;


public class Answers {

  private String answerId;
  private String answerUser;
  private java.sql.Date answerTime;
  private long supportNum;
  private long objectionNum;
  private String questionId;
  private String answer;


  public String getAnswerId() {
    return answerId;
  }

  public void setAnswerId(String answerId) {
    this.answerId = answerId;
  }


  public String getAnswerUser() {
    return answerUser;
  }

  public void setAnswerUser(String answerUser) {
    this.answerUser = answerUser;
  }


  public java.sql.Date getAnswerTime() {
    return answerTime;
  }

  public void setAnswerTime(java.sql.Date answerTime) {
    this.answerTime = answerTime;
  }


  public long getSupportNum() {
    return supportNum;
  }

  public void setSupportNum(long supportNum) {
    this.supportNum = supportNum;
  }


  public long getObjectionNum() {
    return objectionNum;
  }

  public void setObjectionNum(long objectionNum) {
    this.objectionNum = objectionNum;
  }


  public String getQuestionId() {
    return questionId;
  }

  public void setQuestionId(String questionId) {
    this.questionId = questionId;
  }


  public String getAnswer() {
    return answer;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }

}
