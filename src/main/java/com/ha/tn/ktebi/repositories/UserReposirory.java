package com.ha.tn.ktebi.repositories;

import com.ha.tn.ktebi.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserReposirory extends JpaRepository<User , Integer> {
}
