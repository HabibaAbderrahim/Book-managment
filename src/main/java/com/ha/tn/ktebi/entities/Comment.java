package com.ha.tn.ktebi.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;
    private String description ;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book bookId ;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userid ;


     // @ join colum :helps us specify the column we'll use for joining an entity association or element collection

}
