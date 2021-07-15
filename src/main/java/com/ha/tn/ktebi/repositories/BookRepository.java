package com.ha.tn.ktebi.repositories;

import com.ha.tn.ktebi.entities.Book;
import com.ha.tn.ktebi.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface BookRepository extends JpaRepository<Book , Integer> {

    //Filters
    //find By critéria (7arf ---> getBooks with the 7arf )
    public List<Book> findByTitleContainingIgnoreCase(String title);
    public List<Book> findByAuthorLike(String author);
    public List<Book> findByEditorContains(String title);
    //SORT
    public List<Book> findFirst10ByDateAdd(LocalDate dateBook);


    //Multiple Recherche
   // @Query("select * from Book b , Category c , Type t where b.ti")



}
