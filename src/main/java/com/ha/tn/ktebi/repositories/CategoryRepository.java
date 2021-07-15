package com.ha.tn.ktebi.repositories;

import com.ha.tn.ktebi.entities.Book;
import com.ha.tn.ktebi.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category,String> {

    public List<Book> findByNameCat (String categorie) ;
}
