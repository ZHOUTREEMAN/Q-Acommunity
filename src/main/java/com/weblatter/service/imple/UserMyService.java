package com.weblatter.service.imple;

import com.weblatter.dao.QuestionsDao;
import com.weblatter.dao.UsersDao;
import com.weblatter.entity.Questions;
import com.weblatter.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.Map;

@Service
public class UserMyService implements IUserService {
    @Autowired
    private UsersDao usersDao;
    @Autowired
    private QuestionsDao questionsDao;
    private static double id=10000;

    public void sendQuestion(String question,String complement, int score,String user_id) {
        String question_id=String.valueOf(id);
        id++;
        Questions questions=new Questions();
        questions.setAnswer_num(0);
        questions.setComplement(complement);
        questions.setIntegral(score);
        questions.setLabel_m("学习");
        questions.setQuestion(question);
        questions.setQuestion_following_num(0);
        questions.setQuestion_id(question_id);
        questions.setQuestion_status("0");//未审核
        questions.setQuestion_time(new Date(2019, 0, 1));
        questions.setUser_id(user_id);
        questionsDao.insertQuestions(questions);
    }

    public int answerQuestion(String questionId, String userID) {
        return 0;
    }

    public void commentAnswer(String answerId, String userId) {

    }

    public void support(String answerId) {

    }

    public void store(String userId, String answerId) {

    }

    public void objectQuestion(String userId, String questionId) {

    }

    public Map<Questions, String> hostpageQuestions(String userId) {
        return null;
    }
}
