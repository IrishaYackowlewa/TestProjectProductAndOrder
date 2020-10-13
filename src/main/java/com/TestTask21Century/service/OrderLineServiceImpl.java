package com.TestTask21Century.service;

import com.TestTask21Century.entity.OrderLine;
import com.TestTask21Century.repository.OrderLineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderLineServiceImpl implements EntityService<OrderLine> {
    @Autowired
    private OrderLineRepository orderLineRepository;

    @Override
    public OrderLine save(OrderLine orderLine) {
        return orderLineRepository.saveAndFlush(orderLine);
    }

    @Override
    public OrderLine edit(OrderLine orderLine) {
        return orderLineRepository.saveAndFlush(orderLine);
    }

    @Override
    public OrderLine findById(Long id) {
        return orderLineRepository.findById(id).orElse(new OrderLine(0l,0l,0));
    }

    @Override
    public Iterable<OrderLine> findAll() {
        return orderLineRepository.findAll();
    }

    @Override
    public void delete(OrderLine entity) {
        orderLineRepository.delete(entity);
    }
}
