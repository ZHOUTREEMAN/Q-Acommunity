package com.weblatter.entity;


public class UsersM {

  private String user_id;
  private String user_name;
  private long followers_num;
  private long fans_num;
  private String email;
  private String personal_profile;
  private long integral;
  private String password;


  public String getUser_id() {
    return user_id;
  }

  public void setUser_id(String user_id) {
    this.user_id = user_id;
  }


  public String getUserName() {
    return user_name;
  }

  public void setUserName(String userName) {
    this.user_name = userName;
  }


  public long getFollowers_num() {
    return followers_num;
  }

  public void setFollowers_num(long followers_num) {
    this.followers_num = followers_num;
  }


  public long getFans_num() {
    return fans_num;
  }

  public void setFans_num(long fans_num) {
    this.fans_num = fans_num;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public String getPersonal_profile() {
    return personal_profile;
  }

  public void setPersonal_profile(String personal_profile) {
    this.personal_profile = personal_profile;
  }


  public long getIntegral() {
    return integral;
  }

  public void setIntegral(long integral) {
    this.integral = integral;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

}
