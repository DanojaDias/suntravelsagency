package com.danoja.suntravels.services;

import com.danoja.suntravels.Dao.OrderDao;
import com.danoja.suntravels.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderDao orderDao;

    @Transactional
    public List<Order> getAllOrders() {
        return orderDao.getAllOrders();
    }



    public void addOrder(Order order) {
        orderDao.addOrder(order);
    }

}
