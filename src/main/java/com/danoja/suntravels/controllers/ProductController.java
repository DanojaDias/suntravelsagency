package com.danoja.suntravels.controllers;


import com.danoja.suntravels.services.ProductService;
import com.danoja.suntravels.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by jt on 1/10/17.
 */
@RestController
@RequestMapping(value="/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping(path = "/ghjgn",method = RequestMethod.GET )
    public List<Product> getAllProducts() {

        // List<Product> listOfProducts = productService.getAllProducts();
        return productService.getAllProducts();
    }
}
