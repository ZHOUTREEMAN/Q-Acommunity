package com.weblatter.service.imple;

import com.weblatter.dao.*;
import com.weblatter.entity.*;
import com.weblatter.service.IManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;

@Service
public class ManagerService implements IManagerService {
    @Autowired
    WorkersDao  workersDao;
    @Autowired
    AnswersDao answersDao;
    @Autowired
    QuestionsDao questionsDao;
    @Autowired
    BanTalk_Dao banTalk_dao;
    @Autowired
    BanLogin_Dao banLogin_dao;
    public List<Inspect> managerPageShow( ) {
        List<Questions> result1 =questionsDao.selectUndoQuestion();
        List<Answers> result2=answersDao.selectUndoAnswer();
        List<Inspect> result=new ArrayList<Inspect>();
        for(int i=0;i<result1.size();i++)
        {
            result.add(result1.get(i));
        }
        for(int i=0;i<result2.size();i++)
        {
            result.add(result2.get(i));
        }
        return result;
    }

    public void managerInspect(String answerAndQuestionId, String userId, boolean isPass, String suggestion) {
        if(answerAndQuestionId.length()==5)//问题
        {
            Questions questions;
            questions=questionsDao.selectQuestion(answerAndQuestionId);
            if (isPass)
                questions.setProcessing_status("1");
            else
                questions.setProcessing_status("0");
                questions.setProcessing_id(userId);
                questions.setSuggestion(suggestion);
                questionsDao.updateInformation(questions);
        }
        else //回答
        {
            Answers answers;
            answers=answersDao.selectByAnswerId(answerAndQuestionId);
            if(isPass)
            {
                answers.setProcessing_status("1");
            }
            else
            {
                answers.setProcessing_status("0");
            }
                answers.setProcessing_id(userId);
                answers.setSuggestion(suggestion);
                answersDao.updateInformation(answers);
        }
    }

    public List<Questions> showAllInspectedQuestions(String userId) {

        return questionsDao.selectDoneQuestion(userId);
    }

    public List<Answers> showAllInspectAnswers(String userId) {
        return answersDao.selectDoneAnswer(userId);
    }

    public void BanTalk(String userId,String workId) {
        BanTalk banTalk = new BanTalk();
        banTalk.setNo_talk_id(userId);
        banTalk.setWorker_id(workId);
        banTalk_dao.insertBanTalk(banTalk);
    }

    public void LetTalk(String userId) {
        banTalk_dao.deleteBanTalk(userId);
    }

    public void BanLogin(String userId, String workId) {
        BanLogin banLogin=new BanLogin();
        banLogin.setNo_login_id(userId);
        banLogin.setWorker_id(workId);
        banLogin_dao.insertBanLogin(banLogin);
    }

    public void LetLogin(String userId) {
        banLogin_dao.deleteBanLogin(userId);
    }
}
