package com.caixukun.ServiceTest;

import com.caixukun.ApplicationTests;
import com.weblatter.entity.Answers;
import com.weblatter.entity.Inspect;
import com.weblatter.entity.Questions;
import com.weblatter.service.imple.ManagerService;
import org.junit.Test;
import org.junit.validator.PublicClassValidator;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ManagerServiceTest extends ApplicationTests {
    @Autowired
    ManagerService managerService;
    @Test
    public void managerPageShowTest ()
    {
        List <Inspect> inspects = new ArrayList<Inspect>();
       inspects= managerService.managerPageShow();
       for(Inspect i:inspects)
       {
           if(i instanceof Answers)
           {
               Answers a=(Answers)i;
               System.out.println(a.getAnswer_id()+"  "+a.getAnswer());
           }
           else
           {
               Questions q=(Questions)i;
               System.out.println(q.getQuestion_id()+"  "+q.getQuestion());
           }
       }
    }
    @Test
    public void managerInspectTest()
    {
         managerService.managerInspect("000001" ,"00000002",true,"写的很好没有意见");
    }
    @Test
    public void showAllInspectedQuestionsTest()
    {
        List <Questions> questions=new ArrayList<Questions>();
        questions=managerService.showAllInspectedQuestions("00000001");
        for(Questions q:questions)
        {
            System.out.println(q.getQuestion_id()+" "+q.getQuestion());
        }
    }
    @Test
    public void showAllInspectAnswersTest()
    {
        List <Answers> answers=new ArrayList<Answers>();
        answers= managerService.showAllInspectAnswers("00000003");
        for(Answers a:answers)
        {
            System.out.println(a.getAnswer_id()+"  "+a.getAnswer());
        }
    }
    @Test
    public void BanTalkTest()
    {
        managerService.BanTalk("00000001", "00000001");
    }
    @Test
    public void LetTalkTest()
    {
        managerService.LetTalk("00000001");
    }
    @Test
    public void BanLoginTest()
    {
        managerService.BanLogin("00000001", "00000001");
    }
    @Test
    public void LetLoginTest()
    {
        managerService.LetLogin("00000001");
    }
}
