package com.ha.tn.ktebi.services;

import com.ha.tn.ktebi.entities.Category;
import com.ha.tn.ktebi.entities.Type;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface TypeService {

    public ResponseEntity<List<Type>> getAllTypes ();
}
