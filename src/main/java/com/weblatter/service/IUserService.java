package com.weblatter.service;

import com.weblatter.entity.Questions;
import com.weblatter.entity.UsersM;
import com.weblatter.util.Information;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Map;

//information是王木辛写的工具类，在util里,自己可以增添工具类，尽量精简
@Service
public interface IUserService {

    /**
     * 发布问题
     * @param question
     * @param score 悬赏积分
     * 注意自动生成Question的其他选项
     */
    public void sendQuestion(String question,String complement, int score,String user_id,String label);

    /**
     * 回答问题
     * @param questionId
     * @param userID
     * 通过两个参数自动生成问题其他信息，注意积分的变化
     */

    public int answerQuestion(String questionId, String userID,String answer) throws IOException;

    /**
     * 评论
     * @param answerId
     * @param userId
     * @return 更新用户积分
     */
    public void commentAnswer(String answerId, String userId,String comment);

    /**
     * 点赞
     * @param answerId
     */
    public void support(String answerId);

    /**
     * 收藏
     * @param userId
     * @param answerId
     */
    public void storeAnswer(String userId, String answerId);

    /**
     * 关注
     * @param userId
     * @param questionId
     */
    public void storeQuestion(String userId, String questionId);

    /**
     * 用户主页的问题,先匹配关注的问题，再匹配推荐的问题
     * @param userId
     * @return 这个返回要注意，返回的是问题和问题相应的图片的url,尽量搜索图片,如果没有图片返回空值
     */
    public Map<Questions, String> hostpageQuestions(String userId);
}
