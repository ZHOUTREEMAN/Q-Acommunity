package com.weblatter.entity;


public class Questions extends Inspect {

  private String questionId;
  private String userId;
  private java.sql.Date questionTime;
  private String questionStatus;
  private String question;
  private String complement;
  private String labelM;
  private long integral;
  private long answerNum;
  private long questionFollowingNum;


  public String getQuestionId() {
    return questionId;
  }

  public void setQuestionId(String questionId) {
    this.questionId = questionId;
  }


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public java.sql.Date getQuestionTime() {
    return questionTime;
  }

  public void setQuestionTime(java.sql.Date questionTime) {
    this.questionTime = questionTime;
  }


  public String getQuestionStatus() {
    return questionStatus;
  }

  public void setQuestionStatus(String questionStatus) {
    this.questionStatus = questionStatus;
  }


  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }


  public String getComplement() {
    return complement;
  }

  public void setComplement(String complement) {
    this.complement = complement;
  }


  public String getLabelM() {
    return labelM;
  }

  public void setLabelM(String labelM) {
    this.labelM = labelM;
  }


  public long getIntegral() {
    return integral;
  }

  public void setIntegral(long integral) {
    this.integral = integral;
  }


  public long getAnswerNum() {
    return answerNum;
  }

  public void setAnswerNum(long answerNum) {
    this.answerNum = answerNum;
  }


  public long getQuestionFollowingNum() {
    return questionFollowingNum;
  }

  public void setQuestionFollowingNum(long questionFollowingNum) {
    this.questionFollowingNum = questionFollowingNum;
  }

}
