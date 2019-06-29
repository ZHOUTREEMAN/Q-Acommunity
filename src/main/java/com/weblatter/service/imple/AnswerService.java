package com.weblatter.service.imple;

import com.weblatter.dao.AnswersDao;
import com.weblatter.dao.UsersDao;
import com.weblatter.entity.Answers;
import com.weblatter.entity.UsersM;
import com.weblatter.service.IAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnswerService implements IAnswerService {
    @Autowired
    AnswersDao answersDao ;
    @Autowired
    UsersDao usersDao;
    public List<UsersM> getAnswerUserInformation(String questionId) {
            List<Answers> ans =  answersDao.selectAnswer(questionId);
            List<UsersM> um = new ArrayList<UsersM>();//此处需要判断答案是否通过审核
            for (int i = 0; i < ans.size(); i++) {
                if(!ans.get(i).getProcessing_status().equals("1"))//判断是否审核
                {
                    continue;
                }
                String userid = ans.get(i).getAnswer_user();
                UsersM usersM = usersDao.selectUsersInformation2(userid);
                if (!usersM.equals(null))
                    um.add(usersM);
                else
                    break;
            }
        return um;
    }
}
