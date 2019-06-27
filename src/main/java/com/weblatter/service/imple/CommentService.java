package com.weblatter.service.imple;

import com.weblatter.dao.Comment_answersDao;
import com.weblatter.entity.CommentAnswer;
import com.weblatter.service.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService implements ICommentService {
    @Autowired
    Comment_answersDao commentAnswersDao;
    public List<CommentAnswer> getCommentsList(String answerId) {
        commentAnswersDao.selectComment(answerId);

        return null;
    }
}
