package com.weblatter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.weblatter.entity.*;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@RestController
public class HelloWorldController {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @RequestMapping("/")
    public String sayHello(){
        return "HelloWorld";
    }
    //
    @RequestMapping("/userlist")
     public int getUserList(){
     String sql ="SELECT * FROM users_m";
     List<Users> userList = jdbcTemplate.query(sql, new RowMapper<Users> () {
     Users user = null;
     //@Override
     public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
     user = new Users();
     user.setUser_id(rs.getString("user_id"));
     user.setUser_name(rs.getString("user_name"));
     return user;
     }});
     for(Users user:userList){
     System.out.println(user.getUser_name());
     }
     return userList.size();
     }
}
