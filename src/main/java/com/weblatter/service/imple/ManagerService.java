package com.weblatter.service.imple;

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
    public List<Inspect> managerPageShow(String managerId) {
        return null;
    }

    public void managerInspect(String answerAndQuestionId, String userId, boolean isPass, String suggestion) {

    }

    public List<Questions> showAllInspectedQuestions(String userId) {
        return null;
    }

    public List<Answers> showAllInspectAnswers(String userId) {
        return null;
    }
}
