package com.danoja.suntravels.Dao;


import com.danoja.suntravels.model.Hotel;
import com.danoja.suntravels.repositories.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;


@Component
public class HotelDao {
    @Autowired
    HotelRepository hotelRepository;

    public List<Hotel> getAllHotels(){
        return hotelRepository.findAll();
    }

    public Hotel getHotelById(Long id){
        return hotelRepository.findOne(id);
    }



    @Transactional
    public void addHotel(Hotel hotel) {
        hotelRepository.save(hotel);
    }
}
