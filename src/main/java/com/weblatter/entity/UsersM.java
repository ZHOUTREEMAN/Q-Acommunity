package com.weblatter.entity;


public class UsersM {

  private String userId;
  private String userName;
  private long followersNum;
  private long fansNum;
  private String email;
  private String personalProfile;
  private String password;


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public long getFollowersNum() {
    return followersNum;
  }

  public void setFollowersNum(long followersNum) {
    this.followersNum = followersNum;
  }


  public long getFansNum() {
    return fansNum;
  }

  public void setFansNum(long fansNum) {
    this.fansNum = fansNum;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public String getPersonalProfile() {
    return personalProfile;
  }

  public void setPersonalProfile(String personalProfile) {
    this.personalProfile = personalProfile;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

}
