package com.ha.tn.ktebi.repositories;

import com.ha.tn.ktebi.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,String> {
}
