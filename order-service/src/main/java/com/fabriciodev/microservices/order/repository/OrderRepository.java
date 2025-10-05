package com.fabriciodev.microservices.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fabriciodev.microservices.order.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {}
