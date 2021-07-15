package com.ha.tn.ktebi.repositories;

import com.ha.tn.ktebi.entities.Book;
import com.ha.tn.ktebi.entities.Type;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TypeRepository  extends JpaRepository<Type , String> {

    //getAllBooksWith the type
    public List<Book> findByNameType (String type) ;
}
