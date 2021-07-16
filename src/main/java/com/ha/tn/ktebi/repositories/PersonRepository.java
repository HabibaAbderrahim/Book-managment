package com.ha.tn.ktebi.repositories;

import com.ha.tn.ktebi.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person , Integer> {

    public Person findByIdAndMail (Integer id , String email) ;
    boolean existsByMail(String email);
    boolean existsByMailAndId(String email , Integer id);

}
