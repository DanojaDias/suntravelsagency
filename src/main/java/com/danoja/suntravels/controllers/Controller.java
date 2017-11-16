package com.danoja.suntravels.controllers;


import com.danoja.suntravels.services.HotelService;
import com.danoja.suntravels.model.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by jt on 1/10/17.
 */
@RestController
@RequestMapping(value="/hotel")
public class Controller {
    @Autowired
    HotelService hotelService;

    @RequestMapping(path = "/",method = RequestMethod.GET )
    public List<Hotel> getAllHotels() {

        // List<Product> listOfProducts = productService.getAllProducts();
        return hotelService.getAllHotels();
    }

    @RequestMapping(path = "/add",method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<String> addHotel(@RequestBody Hotel hotel) {

        // List<Product> listOfProducts = productService.getAllProducts();
        //return hotelService.getAllHotels();



        hotelService.addHotel(hotel);

        if (hotel == null)
            return ResponseEntity.noContent().build();

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
