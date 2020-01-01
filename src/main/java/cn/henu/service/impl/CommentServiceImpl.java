package cn.henu.service.impl;

import cn.henu.dao.CommentMapper;
import cn.henu.pojo.Comment;
import cn.henu.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
@Service
public class CommentServiceImpl  implements CommentService {
    @Autowired
    private CommentMapper commentMapper;
    @Override
    public List<Comment> selectByArticleId( int id) {
        return commentMapper.selectByArticleId(id);
    }
    @Override
    public int addComment(Comment comment) {
        return  commentMapper.insert(comment);
    }

    @Override
    public List<Comment> findAll() {
        List<Comment> list=commentMapper.selectAll();
        Collections.sort(list);
        return list;
    }

    @Override
    public int delComment(int id) {
        return commentMapper.delCommentById(id);
    }

    @Override
    public int countComm() {
        return commentMapper.countComm().size();
    }

    @Override
    public Comment findCommById(int commentId) {
        return commentMapper.findCommById(commentId);
    }

    @Override
    public int delCommentByArticleId(int articleId) {
        return commentMapper.delCommentByArticleId(articleId);
    }
}
