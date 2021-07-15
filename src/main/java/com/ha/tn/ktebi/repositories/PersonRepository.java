package com.ha.tn.ktebi.repositories;

import com.ha.tn.ktebi.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person , Integer> {

    public Person findByIdAndEmail (Integer id , String email) ;
    boolean existsByEmail(String email);
    boolean existsByEmailAndId(String email , Integer id);

}
