package com.softwareENPM.ENPM.Service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.softwareENPM.ENPM.Entity.Order;
import com.softwareENPM.ENPM.Enums.OrderStatus;
import com.softwareENPM.ENPM.Repository.OrderRepository;
import java.util.*;
import jakarta.transaction.Transactional;

@Service
public class OrderService {
    
    @Autowired
    private OrderRepository orderRepository;
    
    private void getMarketData()
    {
        final String uri = "http://localhost:8080/api/market/v1";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        System.out.println(result);
    }

    @Transactional
    public Order createOrder(Order order)
    {
        order.setOrderStatus(OrderStatus.COMPLETED);
        order.setTimestamp(LocalDateTime.now());
        orderRepository.save(order);
        getMarketData();
        return order;
    }

    public List<Order> getOrders()
    {
        return orderRepository.findAll();
    }

    public void deleteOrders()
    {
        orderRepository.deleteAll();
    }


  


}
