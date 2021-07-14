package com.ha.tn.ktebi.repositories;

import com.ha.tn.ktebi.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment , Integer> {
}
