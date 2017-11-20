package com.danoja.suntravels.Dao;

import com.danoja.suntravels.model.Order;
import com.danoja.suntravels.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
public class OrderDao {
    @Autowired
    OrderRepository orderRepository;

    @Transactional
    public void addOrder(Order order) {
        orderRepository.save(order);
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}
