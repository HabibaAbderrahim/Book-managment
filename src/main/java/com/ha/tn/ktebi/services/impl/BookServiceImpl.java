package com.ha.tn.ktebi.services.impl;

import com.ha.tn.ktebi.entities.Book;
import com.ha.tn.ktebi.repositories.BookRepository;
import com.ha.tn.ktebi.repositories.CategoryRepository;
import com.ha.tn.ktebi.repositories.TypeRepository;
import com.ha.tn.ktebi.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.parser.Part;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository ;
    @Autowired
    private CategoryRepository categoryRepository ;
    @Autowired
    private TypeRepository typeRepository ;

    @Override
    public ResponseEntity addBook(Book book) {
        book.setViews(0);
        Book b = bookRepository.save(book);
    return new ResponseEntity<>(b,HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity updateBook(Book book) {

        if (!(bookRepository.existsById(book.getIdBook())))
            return new ResponseEntity<>("There is no book !!", HttpStatus.NOT_FOUND);

        Book b = bookRepository.save(book);
        return new ResponseEntity(b,HttpStatus.ACCEPTED);

    }

    @Override
    public ResponseEntity deleteBook(Integer bookid) {
        if (!(bookRepository.existsById(bookid)))
            return new ResponseEntity<>("There is no book !!", HttpStatus.NOT_FOUND);

        bookRepository.deleteById(bookid);
        return new ResponseEntity("Book deleted successfully ",HttpStatus.ACCEPTED);

    }

    @Override
    public ResponseEntity<List<Book>> getAllBooks() {

        List<Book> listB = bookRepository.findAll();
        if (listB.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(listB,HttpStatus.ACCEPTED);
    }

    @Override
    public ResponseEntity<Book> getBookByID(Integer bookid) {
        Book book = bookRepository.findById(bookid).orElse(null);
        return new ResponseEntity<>(book , HttpStatus.FOUND);
    }

    @Override
    public ResponseEntity<List<Book>> getBookByCriteria(String criteria) {
        //Title
        List<Book> bookL = bookRepository.findByTitleContainingIgnoreCase(criteria);
        if (bookL.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(bookL , HttpStatus.ACCEPTED);
    }

    @Override
    public ResponseEntity<List<Book>> getBookByCatg(String category) {

        List<Book> bookL = categoryRepository.findByNameCat(category);
        if (bookL.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(bookL , HttpStatus.ACCEPTED);
    }

    @Override
    public ResponseEntity<List<Book>> getBookByType(String type) {
        List<Book> bookL = typeRepository.findByNameType(type);
        if (bookL.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(bookL , HttpStatus.ACCEPTED);
    }

    @Override
    public ResponseEntity<List<Book>> getTopRecentBook() {

        List<Book> bookL = bookRepository.findFirst10ByDateAdd(LocalDate.now());
        if (bookL.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(bookL , HttpStatus.ACCEPTED);
    }

    @Override
    public ResponseEntity<List<Book>> getBookByAuthor(String author) {
        List<Book> bookL = bookRepository.findByAuthorLike(author);
        if (bookL.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(bookL , HttpStatus.ACCEPTED);
    }

    @Override
    public ResponseEntity<List<Book>> getBookByEditor(String editor) {
        List<Book> bookL = bookRepository.findByEditorContains(editor);
        if (bookL.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(bookL , HttpStatus.ACCEPTED);
    }

    @Override
    public ResponseEntity<List<Book>> getBookByTypeAndCategoryAndTitle(String type, String category, String Title) {
        return null;
    }
}
