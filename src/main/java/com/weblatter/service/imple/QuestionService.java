package com.weblatter.service.imple;

import com.weblatter.dao.AnswersDao;
import com.weblatter.dao.QuestionsDao;
import com.weblatter.entity.Answers;
import com.weblatter.entity.Questions;
import com.weblatter.service.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class QuestionService implements IQuestionService {
    @Autowired
    AnswersDao answersDao;
    @Autowired
    QuestionsDao questionsDao;

    public Map<Questions, String> getHotQuestion(int questionNum) {
        return null;
    }

    public List<Answers> getAnswers(String questionId, int num) {
        List<Answers> answersList = answersDao.selectAnswer(questionId);
        if (answersList != null) {
            if (answersList.size() <= num)
                return answersList;
            else {
                return answersList.subList(0, num - 1);
            }
        }else return null;
    }
    public List<Questions>getCommonQuestions(){
        List<Questions>questions = questionsDao.selectAllQuestions();
        List<Questions>resList = new ArrayList<Questions>();
        for(Questions questions1 : resList)
            if(Boolean.parseBoolean(questions1.getProcessing_status()))
                questions.add(questions1);
        return resList;
    }
}
