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
}
