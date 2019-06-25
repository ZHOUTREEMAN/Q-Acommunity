package com.weblatter.entity;


public class UsersM {

  private String user_id;
  private String user_name;
  private long followers_num;
  private long fans_num;
  private String email;
  private String personal_profile;
  private String password;


  public String getUserId() {
    return user_id;
  }

  public void setUserId(String userId) {
    this.user_id = userId;
  }


  public String getUserName() {
    return user_name;
  }

  public void setUserName(String userName) {
    this.user_name = userName;
  }


  public long getFollowersnum() {
    return followers_num;
  }

  public void setFollowersnum(long followersnum) {
    this.followers_num = followersnum;
  }


  public long getFansNum() {
    return fans_num;
  }

  public void setFansNum(long fansNum) {
    this.fans_num = fansNum;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public String getPersonalProfile() {
    return personal_profile;
  }

  public void setPersonalProfile(String personalProfile) {
    this.personal_profile = personalProfile;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

}
