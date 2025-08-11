package com.sesac.orderservice.repository;


import java.util.List;

import com.sesac.orderservice.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

	public List<Order> findByUserIdOrderByCreatedAtDesc(Long customerId);
}
