package com.TestTask21Century.repository;

import com.TestTask21Century.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
