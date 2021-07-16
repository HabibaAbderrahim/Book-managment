package com.ha.tn.ktebi.repositories;

import com.ha.tn.ktebi.entities.Comment;
import com.ha.tn.ktebi.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface CommentRepository extends JpaRepository<Comment , Integer> {


    public Comment findByIdAndUserid (Integer idComment , Integer idUser) ;
    boolean existsByUserid(Integer idUser);
    boolean existsByUseridAndId(String emailUser , Integer idComment);
    public Comment findByDateCreate(LocalDate dateComment) ;
    boolean existsByDateCreate (LocalDate dateComment);
    //

}
