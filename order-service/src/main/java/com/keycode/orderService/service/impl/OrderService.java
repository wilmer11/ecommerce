package com.keycode.orderService.service.impl;

import com.keycode.orderService.domain.Order;
import com.keycode.orderService.repository.OrderRepository;
import com.keycode.orderService.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderService implements IOrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }
}
