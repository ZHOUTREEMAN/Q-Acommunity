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
        return 1;
    }
}
