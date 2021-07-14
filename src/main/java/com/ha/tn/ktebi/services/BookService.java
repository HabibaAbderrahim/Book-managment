package com.ha.tn.ktebi.services;

import com.ha.tn.ktebi.entities.Book;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface BookService {

    public ResponseEntity addBook(Book book) ;
    public ResponseEntity updateBook (Book book) ;
    public ResponseEntity deleteBook (Integer bookid);
    public ResponseEntity<List<Book>>  getAllBooks ();
    public ResponseEntity<Book> getBookByID (Integer bookid) ;
    public ResponseEntity<List<Book>> getBookByCriteria (String criteria) ;
    public ResponseEntity<List<Book>>getBookByCatg (String category) ;
    public ResponseEntity<List<Book>>getBookByTpype (String type) ;
    //TOP 10 2021
    public ResponseEntity<List<Book>> getTopRecentBook ();
    public ResponseEntity<List<Book>> getBookByAuthor (String author);
    public ResponseEntity<List<Book>> getBookByEditor (String editor);








}
