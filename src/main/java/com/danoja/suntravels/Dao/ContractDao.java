package com.danoja.suntravels.Dao;

import com.danoja.suntravels.model.Contract;
import com.danoja.suntravels.repositories.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class ContractDao {
    @Autowired
    ContractRepository contractRepository;

    @Transactional
    public void addContract(Contract contract) {
        contractRepository.save(contract);
    }
}
