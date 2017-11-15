package com.danoja.suntravels.repositories;

import com.danoja.suntravels.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jt on 1/10/17.
 */
@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {
}
