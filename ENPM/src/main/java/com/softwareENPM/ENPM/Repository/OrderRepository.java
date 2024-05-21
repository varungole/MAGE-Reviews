package com.softwareENPM.ENPM.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.softwareENPM.ENPM.Entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{
    
}