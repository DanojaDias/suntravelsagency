package com.danoja.suntravels.services;

import com.danoja.suntravels.Dao.ProductDao;
import com.danoja.suntravels.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by jt on 1/10/17.
 */
@Service
public class ProductService {

    @Autowired
    ProductDao productDao;

    @Transactional
    public List<Product> getAllProducts() {
        return productDao.getAllProducts();
    }
}
