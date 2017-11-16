package com.danoja.suntravels.Dao;


import com.danoja.suntravels.model.Hotel;
import com.danoja.suntravels.repositories.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by jt on 1/10/17.
 */
@Component
public class HotelDao {
    @Autowired
    HotelRepository hotelRepository;
    public List<Hotel> getAllHotels(){
        return hotelRepository.findAll();
    }

    @Transactional
    public void addHotel(Hotel hotel) {
        hotelRepository.save(hotel);
    }
}
