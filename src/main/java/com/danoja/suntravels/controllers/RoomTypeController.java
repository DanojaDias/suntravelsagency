package com.danoja.suntravels.controllers;

import com.danoja.suntravels.model.RoomType;
import com.danoja.suntravels.services.ContractService;
import com.danoja.suntravels.services.RoomTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/room-type")
public class RoomTypeController {

    @Autowired
    RoomTypeService roomtypeService;

    @RequestMapping(path = "/",method = RequestMethod.GET )
    public List<RoomType> getAllRoomTypes() {
        return roomtypeService.getAllRoomTypes();
    }

    @RequestMapping(path = "/add-room-type",method = RequestMethod.POST)
    public ResponseEntity<String> addRoomType(@RequestBody RoomType roomType) {
        roomtypeService.addRoomType(roomType);

        if (roomType == null) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
