package com.danoja.suntravels.services;

import com.danoja.suntravels.Dao.CustomerDao;
import com.danoja.suntravels.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerDao customerDao;

    @Transactional
    public void addCustomer(Customer customer) {
        customerDao.addCustomer(customer);
    }

    public List<Customer> getAllCustomers() {
        return customerDao.getAllCustomers();
    }
}
