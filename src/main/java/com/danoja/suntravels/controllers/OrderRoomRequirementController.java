package com.danoja.suntravels.controllers;

import com.danoja.suntravels.model.OrderRoomRequirement;
import com.danoja.suntravels.services.OrderRoomRequirementService;
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
public class OrderRoomRequirementController {
    @Autowired
    OrderRoomRequirementService orderRoomRequirementService;

    @RequestMapping(path = "/",method = RequestMethod.GET )
    public List<OrderRoomRequirement> getAllOrderRoomRequirements() {
        return orderRoomRequirementService.getAllOrderRoomRequirements();
    }

    @RequestMapping(path = "/add-orderRoomRequirement",method = RequestMethod.POST)
    public ResponseEntity<String> addOrderRoomRequirement(@RequestBody OrderRoomRequirement orderRoomRequirement) {
        orderRoomRequirementService.addOrderRoomRequirement(orderRoomRequirement);

        if (orderRoomRequirement == null) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
