package com.ha.tn.ktebi;

import com.ha.tn.ktebi.entities.User;
import com.ha.tn.ktebi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class KtebiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(KtebiApplication.class, args);
	}

	@Autowired
    private UserRepository userRepository;
	@Override
	public void run(String... args) throws Exception {
		User us = new User();
		us.setMail("hedi@gmail.com");
		us.setBirthDay(LocalDate.now());
		us.setName("hedi");

		userRepository.save(us);


	}
}
