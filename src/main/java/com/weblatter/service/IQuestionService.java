package com.weblatter.service;

import com.weblatter.entity.Answers;
import com.weblatter.entity.Questions;

import java.util.List;
import java.util.Map;

public interface IQuestionService {

    /**
     *热榜
     * @param questionNum
     * @return问题和问题的url
     * 匹配关注最高的questionNum问题
     */
    public Map<Questions, String>getHotQuestion(int questionNum);

    /**
     *获取最多n条问题下的回答
     * @param num
     * @return回答列表
     */
    public List<Answers>getAnswers(String questionId ,int num);
}
