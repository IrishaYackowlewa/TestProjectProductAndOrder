package com.TestTask21Century.service;

import com.TestTask21Century.entity.Order;
import com.TestTask21Century.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class OrderServiceImpl implements EntityService<Order> {
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order save(Order entity) {
        return orderRepository.saveAndFlush(entity);
    }

    @Override
    public Order edit(Order entity) {
        return orderRepository.saveAndFlush(entity);
    }

    @Override
    public Order findById(Long primaryKey) {
        return orderRepository.findById(primaryKey).orElse(new Order("mail",new Date(2000,11,18),"street"));
    }

    @Override
    public Iterable<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public void delete(Order entity) {
        orderRepository.delete(entity);
    }
}
