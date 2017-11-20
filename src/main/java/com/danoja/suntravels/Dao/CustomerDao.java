package com.danoja.suntravels.Dao;

import com.danoja.suntravels.model.Customer;
import com.danoja.suntravels.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
public class CustomerDao {
    @Autowired
    CustomerRepository customerRepository;

    @Transactional
    public void addCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
}
