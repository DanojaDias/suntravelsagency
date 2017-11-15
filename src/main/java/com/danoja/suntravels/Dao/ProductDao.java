package com.danoja.suntravels.Dao;


import com.danoja.suntravels.model.Product;
import com.danoja.suntravels.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by jt on 1/10/17.
 */
@Component
public class ProductDao {
    @Autowired
    ProductRepository productRepository;
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
}
