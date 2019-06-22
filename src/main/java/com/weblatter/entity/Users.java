package com.weblatter.entity;

public class Users {
    private String user_id;
    private String user_name;
    private int followers_num;
    private int fans_num;
    private String email;
    private String personal_profile;
    private String password;

    public int getFans_num() {
        return fans_num;
    }

    public int getFollowers_num() {
        return followers_num;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPersonal_profile() {
        return personal_profile;
    }

    public String getUser_id() {
        return user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFans_num(int fans_num) {
        this.fans_num = fans_num;
    }

    public void setFollowers_num(int followers_num) {
        this.followers_num = followers_num;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPersonal_profile(String personal_profile) {
        this.personal_profile = personal_profile;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
}
