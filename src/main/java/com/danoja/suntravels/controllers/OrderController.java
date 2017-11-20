package com.danoja.suntravels.controllers;

import com.danoja.suntravels.model.Order;
import com.danoja.suntravels.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/order")
public class OrderController {
    @Autowired
    OrderService orderService;

    @RequestMapping(path = "/",method = RequestMethod.GET )
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @RequestMapping(path = "/add-order",method = RequestMethod.POST)
    public ResponseEntity<String> addOrder(@RequestBody Order order) {
        orderService.addOrder(order);

        if (order == null) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
