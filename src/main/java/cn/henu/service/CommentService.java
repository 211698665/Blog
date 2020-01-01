package cn.henu.service;

import cn.henu.pojo.Comment;

import java.util.List;

public interface CommentService {
    public List<Comment> selectByArticleId(int id);
    public int addComment(Comment comment);
    public List<Comment> findAll();
    public int delComment(int id);
    public int countComm();
    public Comment findCommById(int commentId);
    public int delCommentByArticleId(int articleId);
}
