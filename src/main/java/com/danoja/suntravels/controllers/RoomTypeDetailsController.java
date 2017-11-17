package com.danoja.suntravels.controllers;

import com.danoja.suntravels.model.RoomTypeDetails;
import com.danoja.suntravels.services.RoomTypeDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/roomtypedetails")
public class RoomTypeDetailsController {
    @Autowired
    RoomTypeDetailsService roomtypeDetailsService;

    @RequestMapping(path = "/",method = RequestMethod.GET )
    public List<RoomTypeDetails> getAllRoomTypeDetails() {
        return roomtypeDetailsService.getAllRoomTypeDetails();
    }

    @RequestMapping(path = "/add-room-type-details",method = RequestMethod.POST)
    public ResponseEntity<String> addRoomTypeDetails(@RequestBody RoomTypeDetails roomTypeDetails) {
        roomtypeDetailsService.addRoomTypeDetails(roomTypeDetails);

        if (roomTypeDetails == null) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
