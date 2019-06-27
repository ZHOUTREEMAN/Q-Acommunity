package com.weblatter.service.imple;

import com.weblatter.dao.AnswersDao;
import com.weblatter.dao.QuestionsDao;
import com.weblatter.dao.WorkersDao;
import com.weblatter.entity.Answers;
import com.weblatter.entity.Inspect;
import com.weblatter.entity.Questions;
import com.weblatter.service.IManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerService implements IManagerService {
    @Autowired
    WorkersDao  workersDao;
    AnswersDao answersDao;
    QuestionsDao questionsDao;
    public List<Inspect> managerPageShow(String managerId) {
        List<Questions> result1 =questionsDao.selectUndoQuestion();
        List<Answers> result2=answersDao.selectUndoAnswer();
        List<Inspect> result=null;
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
        //暂时不知道修改意见怎么处理？？
        if(answerAndQuestionId.length()==5)//问题
        {
            if (isPass)
                questionsDao.selectQuestion(answerAndQuestionId).setProcessing_status("1");
            else
                questionsDao.selectQuestion(answerAndQuestionId).setProcessing_status("0");
            questionsDao.selectQuestion(answerAndQuestionId).setProcessing_id(userId);
        }
        else //回答
        {
            if(isPass)
                answersDao.selectByAnswerId(answerAndQuestionId).setProcessing_id("1");
            else
                answersDao.selectByAnswerId(answerAndQuestionId).setProcessing_id("0");
            answersDao.selectByAnswerId(answerAndQuestionId).setProcessing_id(userId);
        }
    }

    public List<Questions> showAllInspectedQuestions(String userId) {

        return questionsDao.selectDoneQuestion();
    }

    public List<Answers> showAllInspectAnswers(String userId) {
        return answersDao.selectDoneAnswer();
    }
}
