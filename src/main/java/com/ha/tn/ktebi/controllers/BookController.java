package com.ha.tn.ktebi.controllers;


import com.ha.tn.ktebi.entities.Book;
import com.ha.tn.ktebi.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/Book")
@CrossOrigin("http://localhost:4200")

public class BookController {

    @Autowired
    private BookService bookService ;

    @GetMapping("/all")
    public ResponseEntity<?> getAllBooks (){
        return bookService.getAllBooks() ;

    }

    @PostMapping("/add")
    public ResponseEntity<?> addBook(@RequestBody Book b  ){
        return  bookService.addBook(b);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteBook (@PathVariable Integer id ){
        return bookService.deleteBook(id);
    }

    @PutMapping("/update")
    public ResponseEntity<?> updateBook(@RequestBody Book book){
        return  bookService.updateBook(book);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOneBook (@PathVariable Integer id ){
        return bookService.getBookByID(id);
    }

    @GetMapping("/author/{author}")
    public ResponseEntity<?> getBookAuthor (@PathVariable String author ){
        return bookService.getBookByAuthor(author);
    }

    @GetMapping("/editor/{editor}")
    public ResponseEntity<?> getBookEditor (@PathVariable String editor ){
        return bookService.getBookByEditor(editor);
    }

    @GetMapping("/category/{categ}")
    public ResponseEntity<?> getBookCat (@PathVariable String categ){
        return bookService.getBookByCatg(categ);
    }

    @GetMapping("/title/{title}")
    public ResponseEntity<?> getBookTitle (@PathVariable String title){
        return bookService.getBookByCriteria(title);
    }

    @GetMapping("/type/{type}")
    public ResponseEntity<?> getBookType (@PathVariable String type){
        return bookService.getBookByType(type);
    }

    @GetMapping("/recent")
    public ResponseEntity<?> getBookRecent (){
        return bookService.getTopRecentBook();
    }


}
