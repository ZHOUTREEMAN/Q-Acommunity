package com.weblatter.entity;


public class Messages {

  private String message_id;
  private java.sql.Date processing_time;
  private String publisher_id;
  private String message_type;
  private String processing_status;
  private String processing_id;


  public String getMessage_id() {
    return message_id;
  }

  public void setMessage_id(String message_id) {
    this.message_id = message_id;
  }


  public java.sql.Date getProcessing_time() {
    return processing_time;
  }

  public void setProcessing_time(java.sql.Date processing_time) {
    this.processing_time = processing_time;
  }


  public String getPublisher_id() {
    return publisher_id;
  }

  public void setPublisher_id(String publisher_id) {
    this.publisher_id = publisher_id;
  }


  public String getMessage_type() {
    return message_type;
  }

  public void setMessage_type(String message_type) {
    this.message_type = message_type;
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
