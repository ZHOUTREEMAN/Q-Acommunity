package com.weblatter.service;

import com.weblatter.entity.UsersM;

public interface IAnswerService {

    /**
     * 获取回答问题的用户的用户名信息
     * @param questionId
     * @return用户信息
     */
    public UsersM getAnswerUserInformation(String questionId);
}
