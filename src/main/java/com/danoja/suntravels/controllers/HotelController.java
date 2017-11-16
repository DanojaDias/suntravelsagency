package com.danoja.suntravels.controllers;


import com.danoja.suntravels.model.Contract;
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
public class HotelController {
    @Autowired
    HotelService hotelService;

    @RequestMapping(path = "/",method = RequestMethod.GET )
    public List<Hotel> getAllHotels() {
        return hotelService.getAllHotels();
    }

    @RequestMapping(path = "/add-hotel",method = RequestMethod.POST)
    public ResponseEntity<String> addHotel(@RequestBody Hotel hotel) {
        hotelService.addHotel(hotel);

        if (hotel == null) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }





}
