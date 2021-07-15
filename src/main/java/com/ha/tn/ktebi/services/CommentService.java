package com.ha.tn.ktebi.services;

import com.ha.tn.ktebi.entities.Book;
import com.ha.tn.ktebi.entities.Comment;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CommentService {

    public ResponseEntity addComment(Comment comment) ;
    public ResponseEntity updateComment (Comment comment) ;
    public ResponseEntity deleteComment (Integer commentid);
    public ResponseEntity<List<Comment>>  getAllCommentASC (Book book);
    public ResponseEntity<List<Comment>>  getAllCommentDSC (Book book);
}
