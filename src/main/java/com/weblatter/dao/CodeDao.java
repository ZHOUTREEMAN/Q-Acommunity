package com.weblatter.dao;

import org.apache.ibatis.annotations.Select;

public interface test {
    @Select("SELECT COUNT(*) FROM USERS")
    public int getNumOfUsers();
}
