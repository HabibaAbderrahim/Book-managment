package com.ha.tn.ktebi.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Blob;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idBook ;
    private String title ;
    private String sypnosis ;
    @Lob
    private byte[] picture ;
    // files byte sql
    @Lob
    private Blob file;
    private String author ;
    private Integer nbPage ;
    private String editor ;
    private String isbn ;
    private LocalDate dateAdd ;
    private Integer views ;

    @OneToMany(cascade = CascadeType.ALL ,mappedBy = "bookId")
    private List<Comment> commentList ;

    @JsonIgnoreProperties({"books"})
    @ManyToMany
    @JoinTable( name = "T_Book_Category",
            joinColumns = @JoinColumn( name = "idBook" ),
            inverseJoinColumns = @JoinColumn( name = "idCat" ) )
    private List<Category> categories = new ArrayList<>();


    @OneToOne
    @JoinColumn(name="Type_Book")
    private  Type type ;


    //@ManyToOne
    //@JoinColumn(name ="admin_id")
    //private Admin adminid ;

    //@OneToOne
    //@JoinColumn(name="type")
    //private Type type ;

    //@OneToMany (fetch = FetchType.EAGER)
    //private List<Category> categoryList ;



}
