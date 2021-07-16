package com.ha.tn.ktebi;

import com.ha.tn.ktebi.entities.Book;
import com.ha.tn.ktebi.entities.Category;
import com.ha.tn.ktebi.entities.User;
import com.ha.tn.ktebi.repositories.BookRepository;
import com.ha.tn.ktebi.repositories.CategoryRepository;
import com.ha.tn.ktebi.repositories.UserRepository;
import com.ha.tn.ktebi.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@EnableAutoConfiguration(exclude = {SecurityAutoConfiguration.class})
@SpringBootApplication
public class KtebiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(KtebiApplication.class, args);
	}

	@Autowired
    private UserRepository userRepository;
	@Autowired
	private BookService bookService ;
	@Autowired
	private BookRepository bookRepository ;
	@Autowired
	private CategoryRepository categoryRepository ;
	@Override
	public void run(String... args) throws Exception {
		User us = new User();
		us.setMail("hedi@gmail.com");
		us.setBirthDay(LocalDate.now());
		us.setName("hedi");

		userRepository.save(us);

        Category horror = new Category();
        horror.setNameCat("Horror");
        categoryRepository.save(horror);

		Category action = new Category();
		horror.setNameCat("action");
		categoryRepository.save(action);




		//------------------
		Book b = new Book();
		b.setAuthor("Habiba abderrahim");
		b.setCategories(Arrays.asList(new Category[] {horror,action}));
		b.setDateAdd(LocalDate.now());
		b.setNbPage(150);
		b.setSypnosis("This a Book a bout Habiba and Hedi");
		b.setEditor("Dar al nachr");

		bookRepository.save(b);


	}
}
