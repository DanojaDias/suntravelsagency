package com.danoja.suntravels.controllers;

import com.danoja.suntravels.model.Contract;
import com.danoja.suntravels.model.Hotel;
import com.danoja.suntravels.services.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/contract")
public class ContractController {

    @Autowired
    ContractService contractService;

    @RequestMapping(path = "/",method = RequestMethod.GET )
    public List<Contract> getAllContracts() {
        return contractService.getAllContracts();
    }

    @RequestMapping(path = "/add-contract",method = RequestMethod.POST)
    public ResponseEntity<String> addContract(@RequestBody Contract contract) {
        contractService.addContract(contract);

        if (contract == null) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @RequestMapping(path = "/{hotelId}",method = RequestMethod.GET )
    public List<Contract> getContractByHotelId(@PathVariable Long hotelId) {
        return contractService.getContractById(hotelId);
    }

}
