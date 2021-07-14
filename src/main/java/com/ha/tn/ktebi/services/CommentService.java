package com.ha.tn.ktebi.services;

import com.ha.tn.ktebi.entities.Comment;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CommentService {

    public ResponseEntity addComment(Comment comment) ;
    public ResponseEntity updateComment (Comment comment) ;
    public ResponseEntity deleteComment (Integer commentid);
    public ResponseEntity<List<Comment>>  getAllCommentASC ();
    public ResponseEntity<List<Comment>>  getAllCommentDSC ();
}
