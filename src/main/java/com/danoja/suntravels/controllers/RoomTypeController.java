package com.danoja.suntravels.controllers;

import com.danoja.suntravels.model.Contract;
import com.danoja.suntravels.model.RoomType;
import com.danoja.suntravels.services.ContractService;
import com.danoja.suntravels.services.RoomTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
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
    public long addRoomType(@RequestBody RoomType roomType) {
        return roomtypeService.addRoomType(roomType);
    }

    @RequestMapping(path = "/{roomTypeId}",method = RequestMethod.GET )
    public RoomType getRoomTypeById( @PathVariable Long roomTypeId) {
        return roomtypeService.getRoomTypeById(roomTypeId);
    }
}
