package com.weblatter.service;

import com.weblatter.entity.Answers;
import com.weblatter.entity.Inspect;
import com.weblatter.entity.Questions;

import java.util.List;

public interface IManagerService {
    /**
     * 管理员审核界面
     * @return待审核的问题或回答
     */
    public List<Inspect> managerPageShow( );

    /**
     * 审核后让用户如何接收这个还没有考虑
     * @param answerAndQuestionId 问题或回答的id
     * @param userId 管理员id
     * @param isPass 是否通过
     * @param suggestion 修改意见
     */
    public void managerInspect(String answerAndQuestionId, String userId, boolean isPass,String suggestion);

    /**
     *展示所有审核过的问题
     * @param userId
     * @return
     */
    public List<Questions>showAllInspectedQuestions(String userId);

    /**
     * 展示所有审核的回答
     * @param userId
     * @return
     */
    public List<Answers>showAllInspectAnswers(String userId);

    public void BanTalk(String userId,String workId);//禁言用户

    public void LetTalk(String userId);//解除用户禁言

    public void BanLogin(String userId,String workId);//禁止用户登陆

    public void LetLogin(String userId);//解除用户的登陆禁令


}
