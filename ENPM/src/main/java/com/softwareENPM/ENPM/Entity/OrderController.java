package com.softwareENPM.ENPM.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.softwareENPM.ENPM.Service.OrderService;

@RestController
@RequestMapping("/api/orders/v1")
public class OrderController {
    
    @Autowired
    private OrderService orderService;

    @PostMapping
    public Order createOrder(@RequestBody Order order)
    {
        return orderService.createOrder(order);
    }

    @GetMapping
    public List<Order> getOrders()
    {
        return orderService.getOrders();
    }

    @DeleteMapping
    public void deleteOrders()
    {
        orderService.deleteOrders();
    }
}
