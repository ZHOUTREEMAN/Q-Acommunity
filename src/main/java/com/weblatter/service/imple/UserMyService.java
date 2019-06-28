package com.weblatter.service.imple;

import com.weblatter.dao.*;
import com.weblatter.entity.*;
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
    @Autowired
    private Answers_storeDao answers_storeDao;
    @Autowired
    private Questions_followingDao questions_followingDao;
    private static double question_id_init=10000;
    private static long answer_id_init=100000;
    private static long answerstore_id_init=100000;
    private Calendar calendar=Calendar.getInstance();

    public void sendQuestion(String question,String complement, int score,String user_id,String label) {
        String question_id=String.valueOf((long)question_id_init);
        question_id_init++;
        Questions questions=new Questions();
        questions.setAnswer_num(0);
        questions.setComplement(complement);
        questions.setIntegral(score);
        questions.setLabel_m(label);
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
        UsersM usersM=usersDao.selectUsersInformation2(userID);
        usersM.setIntegral(usersM.getIntegral()+questions.getIntegral());

        Answers answers = new Answers();
        answers.setAnswer(answer);
        answers.setAnswer_id(String.valueOf(answer_id_init++));
        answers.setAnswer_time(new Date(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE)));
        answers.setAnswer_user(userID);
        answers.setObjection_num(0);
        answers.setProcessing_id(null);
        answers.setProcessing_status("0");
        answers.setQuestion_id(questionId);
        answers.setSupportNum(0);
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

    public void support(String answerId) {//点赞
        Answers answers = answersDao.selectByAnswerId(answerId);
        answers.setSupportNum(answers.getSupportNum()+1);
        answersDao.updateInformation(answers);
    }

    public void object(String answerId){
        Answers answers=answersDao.selectByAnswerId(answerId);
        answers.setObjection_num(answers.getObjection_num()+1);
        answersDao.updateInformation(answers);
    }


    public void storeAnswer(String userId, String answerId) {//收藏回答
        AnswersStore answersStore=new AnswersStore();
        answersStore.setAnswerId(answerId);
        answersStore.setStore_id(String.valueOf(answerstore_id_init++));
        answersStore.setUser_id(userId);
        answers_storeDao.insertStores(answersStore);
    }

    public void storeQuestion(String userId, String questionId) {//收藏问题
        QuestionsFollowing questionsFollowing=new QuestionsFollowing();
        questionsFollowing.setQuestion(questionId);
        questionsFollowing.setUser_n(userId);
        questions_followingDao.insertNewQuestionsFollowing(questionsFollowing);
    }

    public Map<Questions, String> hostpageQuestions(String userId) {
        return null;
    }
}
