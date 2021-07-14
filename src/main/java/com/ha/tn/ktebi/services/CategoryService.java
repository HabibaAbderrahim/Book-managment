package com.ha.tn.ktebi.services;

import com.ha.tn.ktebi.entities.Category;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CategoryService {

    public ResponseEntity<List<Category>> getAllCategories ();

}
