package com.danoja.suntravels.controllers;


import com.danoja.suntravels.services.HotelService;
import com.danoja.suntravels.model.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by jt on 1/10/17.
 */
@RestController
@RequestMapping(value="/hotel")
public class ProductController {
    @Autowired
    HotelService hotelService;

    @RequestMapping(path = "/",method = RequestMethod.GET )
    public List<Hotel> getAllProducts() {

        // List<Product> listOfProducts = productService.getAllProducts();
        return hotelService.getAllHotels();
    }
}
