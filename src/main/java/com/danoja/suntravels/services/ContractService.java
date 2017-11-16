package com.danoja.suntravels.services;

import com.danoja.suntravels.Dao.ContractDao;
import com.danoja.suntravels.model.Contract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ContractService {

    @Autowired
    ContractDao contractDao;

    @Transactional
    public void addContract(Contract contract) {
        contractDao.addContract(contract);
    }
}
