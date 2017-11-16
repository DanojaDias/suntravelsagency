package com.danoja.suntravels.controllers;

import com.danoja.suntravels.model.Contract;
import com.danoja.suntravels.services.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/contract")
public class ContractController {

    @Autowired
    ContractService contractService;

    @RequestMapping(path = "/add-contract",method = RequestMethod.POST)
    public ResponseEntity<String> addContract(@RequestBody Contract contract) {
        contractService.addContract(contract);

        if (contract == null) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
