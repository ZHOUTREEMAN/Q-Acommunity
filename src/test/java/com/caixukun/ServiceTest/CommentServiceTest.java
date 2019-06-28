package com.caixukun.ServiceTest;

import com.caixukun.ApplicationTests;
import com.weblatter.service.imple.CommentService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class CommentServiceTest extends ApplicationTests {
    @Autowired
    CommentService commentService;
    @Test
    public void getCommentsListTest ()
    {
        List <CommentAnswer> ca=new ArrayList<CommentAnswer>();
        ca=commentService.getCommentsList("000001");
        for(CommentAnswer a:ca)
        {
            System.out.println(a.getComment_id()+" "+a.getComment());
        }
    }

}
