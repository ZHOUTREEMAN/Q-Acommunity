package com.weblatter.service.imple;

import com.weblatter.dao.AnswersDao;
import com.weblatter.dao.Comment_answersDao;
import com.weblatter.dao.QuestionsDao;
import com.weblatter.dao.UsersDao;
import com.weblatter.entity.Answers;
import com.weblatter.entity.CommentAnswer;
import com.weblatter.entity.Questions;
import com.weblatter.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

@Service
public class UserMyService implements IUserService {
    @Autowired
    private UsersDao usersDao;
    @Autowired
    private QuestionsDao questionsDao;
    @Autowired
    private AnswersDao answersDao;
    @Autowired
    private Comment_answersDao comment_answersDao;
    private static double question_id_init=10000;
    private static double answer_id_init=100000;
    private Calendar calendar=Calendar.getInstance();

    public void sendQuestion(String question,String complement, int score,String user_id) {
        String question_id=String.valueOf(question_id_init);
        question_id_init++;
        Questions questions=new Questions();
        questions.setAnswer_num(0);
        questions.setComplement(complement);
        questions.setIntegral(score);
        questions.setLabel_m("教育");
        questions.setQuestion(question);
        questions.setQuestion_following_num(0);
        questions.setQuestion_id(question_id);
        questions.setProcessing_status("0");//未审核
        questions.setQuestion_time(new Date(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE)));
        questions.setUser_id(user_id);
        questions.setProcessing_id(null);
        questionsDao.insertQuestions(questions);
    }

    public int answerQuestion(String questionId, String userID,String answer) {
        Questions questions = questionsDao.selectQuestion(questionId);

        Answers answers = new Answers();
        answers.setAnswer(answer);
        answers.setAnswer_id(String.valueOf(answer_id_init++));
        answers.setAnswer_time(new Date(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE)));
        answers.setAnswer_user(userID);
        answers.setObjection_num(0);
        answers.setProcessing_id(null);
        answers.setProcessing_status("0");
        answers.setQuestion_id(questionId);
        answers.setSupport_num(0);
        answersDao.insertQuestions(answers);
        return 0;
    }

    public void commentAnswer(String answerId, String userId,String comment) {
        CommentAnswer commentAnswer=new CommentAnswer();
        commentAnswer.setAnswerId(answerId);
        commentAnswer.setComment(comment);
        commentAnswer.setComment_id(userId);
        comment_answersDao.insertComments(commentAnswer);
    }

    public void support(String answerId) {
        Answers answers = answersDao.selectByAnswerId(answerId);
        answers.setSupport_num(answers.getSupport_num()+1);
        answersDao.updateInformation(answers);
    }

    public void store(String userId, String answerId) {

    }

    public void objectQuestion(String userId, String questionId) {

    }

    public Map<Questions, String> hostpageQuestions(String userId) {
        return null;
    }
}
