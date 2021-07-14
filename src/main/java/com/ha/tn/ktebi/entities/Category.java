package com.ha.tn.ktebi.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Category {

    @Id
    private String nameCat ;


    @ManyToMany
    @JoinTable( name = "T_Book_Category",
            joinColumns = @JoinColumn( name = "idCat" ),
            inverseJoinColumns = @JoinColumn( name = "idBook" ) )
    private List<Book> books = new ArrayList<>();




}
