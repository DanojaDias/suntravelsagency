package com.danoja.suntravels.repositories;

import com.danoja.suntravels.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jt on 1/10/17.
 */
@Repository
public interface ProductRepository  extends JpaRepository<Product, Long> {
}
