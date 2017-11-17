package com.danoja.suntravels.Dao;

import com.danoja.suntravels.model.RoomTypeDetails;
import com.danoja.suntravels.repositories.HotelRepository;
import com.danoja.suntravels.repositories.RoomTypeDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
public class RoomTypeDetailsDao {
    @Autowired
    RoomTypeDetailsRepository roomTypeDetailsRepository;

    public List<RoomTypeDetails> getAllRoomTypeDetails(){
        return roomTypeDetailsRepository.findAll();
    }

    @Transactional
    public void addRoomTypeDetails(RoomTypeDetails roomTypeDetails) {
        roomTypeDetailsRepository.save(roomTypeDetails);
    }

}
