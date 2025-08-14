package com.udemy.cursoSpring.resouces;

import com.udemy.cursoSpring.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserResouce {
    @GetMapping
    public ResponseEntity<User> findAll() {
        User u1 = new User(1L, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        return ResponseEntity.ok(u1);
    }
}
