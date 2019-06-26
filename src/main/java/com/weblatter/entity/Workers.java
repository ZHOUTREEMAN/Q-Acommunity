package com.weblatter.entity;


public class Workers {

  private String worker_id;
  private String worker_name;
  private long worker_age;
  private String worker_phone_num;
  private String id_numbers;
  private String email;


  public String getWorker_id() {
    return worker_id;
  }

  public void setWorker_id(String worker_id) {
    this.worker_id = worker_id;
  }


  public String getWorker_name() {
    return worker_name;
  }

  public void setWorker_name(String worker_name) {
    this.worker_name = worker_name;
  }


  public long getWorker_age() {
    return worker_age;
  }

  public void setWorker_age(long worker_age) {
    this.worker_age = worker_age;
  }


  public String getWorker_phone_num() {
    return worker_phone_num;
  }

  public void setWorker_phone_num(String worker_phone_num) {
    this.worker_phone_num = worker_phone_num;
  }


  public String getIdNumbers() {
    return id_numbers;
  }

  public void setIdNumbers(String idNumbers) {
    this.id_numbers = idNumbers;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

}
