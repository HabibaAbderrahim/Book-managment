package com.ha.tn.ktebi.services;

import com.ha.tn.ktebi.entities.Book;
import com.ha.tn.ktebi.entities.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService{

    public ResponseEntity addUser(User user) ;
    public ResponseEntity updateUser (User user);
    public ResponseEntity deleteUser (Integer userId);
    public ResponseEntity<List<User>>  getAllusers ();
    public ResponseEntity<User> getUserByID (Integer userId);



}
