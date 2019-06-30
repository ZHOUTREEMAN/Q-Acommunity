package com.weblatter.service;

import com.weblatter.entity.CommentAnswer;

import java.util.List;

public interface ICommentService {

    /**
     * 获取评论列表
     * @param answerId
     * @return 评论列表
     */
    public List<CommentAnswer> getCommentsList(String answerId);
}
