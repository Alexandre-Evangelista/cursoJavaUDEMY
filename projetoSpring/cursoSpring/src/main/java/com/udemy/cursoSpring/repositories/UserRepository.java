package com.udemy.cursoSpring.repositories;

import com.udemy.cursoSpring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
