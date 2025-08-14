package com.udemy.cursoSpring.repositories;

import com.udemy.cursoSpring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
