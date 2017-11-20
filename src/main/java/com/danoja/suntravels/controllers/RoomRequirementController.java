package com.danoja.suntravels.controllers;

import com.danoja.suntravels.model.RoomRequirement;
import com.danoja.suntravels.services.RoomRequirementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/room-requirement")
public class RoomRequirementController {
    @Autowired
    RoomRequirementService roomRequirementService;

    @RequestMapping(path = "/",method = RequestMethod.GET )
    public List<RoomRequirement> getAllRoomRequirements() {
        return roomRequirementService.getAllRoomRequirements();
    }

    @RequestMapping(path = "/add-room-requirement",method = RequestMethod.POST)
    public ResponseEntity<String> addRoomRequirement(@RequestBody RoomRequirement roomRequirement) {
        roomRequirementService.addRoomRequirement(roomRequirement);

        if (roomRequirement == null) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
