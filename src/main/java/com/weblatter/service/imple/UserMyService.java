package com.weblatter.service.imple;

import com.weblatter.dao.UsersDao;
import com.weblatter.entity.Questions;
import com.weblatter.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserMyService implements IUserService {
    @Autowired
    private UsersDao usersDao;

    public void sendQuestion(String question, int score) {

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
