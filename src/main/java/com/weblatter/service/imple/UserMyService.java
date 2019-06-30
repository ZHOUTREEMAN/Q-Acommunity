package com.weblatter.service.imple;

import com.weblatter.dao.*;
import com.weblatter.entity.*;
import com.weblatter.service.IUserService;
import javafx.scene.text.TextAlignment;
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
    @Autowired
    private static CreateIdDao createIdDao;
    //private static double question_id_init=10000;
//    private static long answer_id_init=100000;
//    private static long answerstore_id_init=100000;
    private Calendar calendar;

    public void sendQuestion(String question,String complement, int score,String user_id,String label) {
        String question_id=getId("question_id");
        //question_id_init++;
        calendar=Calendar.getInstance();
        Questions questions=new Questions();
        questions.setAnswer_num(0);
        questions.setComplement(complement);
        questions.setIntegral(score);
        questions.setLabel_m(label);
        questions.setQuestion(question);
        questions.setQuestion_following_num(0);
        questions.setQuestion_id(question_id);
        questions.setProcessing_status("0");//未审核

        questions.setQuestion_time(new Date(calendar.get(Calendar.YEAR)-1900, calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE)+1));
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
        answers.setAnswer_id(getId("answer_id"));
        answers.setAnswer_time(new Date(calendar.get(Calendar.YEAR)-1900, calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE)+1));
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
        commentAnswer.setAnswer_id(answerId);
        commentAnswer.setComment(comment);
        commentAnswer.setComment_id(userId);
        commentAnswer.setComment_id(getId("comment_id"));
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
        answersStore.setStore_id(getId("store_id"));
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

    public static String getId(String table){
        IdDirectory idDirectory = createIdDao.selectIdDirectory();
        if(table.equals("question_id")){
            String string=String.valueOf(Integer.parseInt(idDirectory.getQuestionId())+1);
            idDirectory.setQuestionId(string);
            createIdDao.updateInformation(idDirectory);
            return string;
        }else if(table.equals("answer_id")){
            String string=String.valueOf(Integer.parseInt(idDirectory.getAnswerId())+1);
            idDirectory.setAnswerId(string);
            createIdDao.updateInformation(idDirectory);
            return string;
        }else if(table.equals("comment_id")){
            String string=String.valueOf(Integer.parseInt(idDirectory.getCommentId())+1);
            idDirectory.setCommentId(string);
            createIdDao.updateInformation(idDirectory);
            return string;
        }else if(table.equals("store_id")){
            String string=String.valueOf(Integer.parseInt(idDirectory.getStoreId())+1);
            idDirectory.setStoreId(string);
            createIdDao.updateInformation(idDirectory);
            return string;
        }else if(table.equals("user_id")){
            String string=String.valueOf(Integer.parseInt(idDirectory.getUserId())+1);
            idDirectory.setUserId(string);
            createIdDao.updateInformation(idDirectory);
            return string;
        }else if(table.equals("worker_id")){
            String string=String.valueOf(Integer.parseInt(idDirectory.getWorkerId())+1);
            idDirectory.setWorkerId(string);
            createIdDao.updateInformation(idDirectory);
            return string;
        }
        return null;
    }
}
