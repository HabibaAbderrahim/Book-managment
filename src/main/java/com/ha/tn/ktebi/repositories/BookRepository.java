package com.ha.tn.ktebi.repositories;

import com.ha.tn.ktebi.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book , Integer> {


}
