package com.weblatter.entity;


public class Messages {

  private String messageId;
  private java.sql.Date processingTime;
  private String publisherId;
  private String messageType;
  private String processingStatus;
  private String processingId;


  public String getMessageId() {
    return messageId;
  }

  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }


  public java.sql.Date getProcessingTime() {
    return processingTime;
  }

  public void setProcessingTime(java.sql.Date processingTime) {
    this.processingTime = processingTime;
  }


  public String getPublisherId() {
    return publisherId;
  }

  public void setPublisherId(String publisherId) {
    this.publisherId = publisherId;
  }


  public String getMessageType() {
    return messageType;
  }

  public void setMessageType(String messageType) {
    this.messageType = messageType;
  }


  public String getProcessingStatus() {
    return processingStatus;
  }

  public void setProcessingStatus(String processingStatus) {
    this.processingStatus = processingStatus;
  }


  public String getProcessingId() {
    return processingId;
  }

  public void setProcessingId(String processingId) {
    this.processingId = processingId;
  }

}
