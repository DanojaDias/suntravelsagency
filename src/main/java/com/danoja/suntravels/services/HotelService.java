package com.danoja.suntravels.services;

import com.danoja.suntravels.Dao.HotelDao;
import com.danoja.suntravels.model.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class HotelService {

    @Autowired
    HotelDao hotelDao;

    @Transactional
    public List<Hotel> getAllHotels() {
        return hotelDao.getAllHotels();
    }



    public void addHotel(Hotel hotel) {
        hotelDao.addHotel(hotel);
    }


}
