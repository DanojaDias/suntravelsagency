package com.danoja.suntravels.Dao;

import com.danoja.suntravels.model.RoomTypeDetails;
import com.danoja.suntravels.repositories.HotelRepository;
import com.danoja.suntravels.repositories.RoomTypeDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.sql.Date;
import java.util.List;

@Component
public class RoomTypeDetailsDao {
    @Autowired
    RoomTypeDetailsRepository roomTypeDetailsRepository;

    public List<RoomTypeDetails> getAllRoomTypeDetails(){
        return roomTypeDetailsRepository.findAll();
    }

    public List<RoomTypeDetails> findRoomTypesForOrder(int numberOfFreeRooms, Date checkInDate, Date EndDate, int adults){
        return roomTypeDetailsRepository.findRoomTypesForOrder(numberOfFreeRooms, checkInDate, EndDate, adults);
    }

    @Transactional
    public void addRoomTypeDetails(RoomTypeDetails roomTypeDetails) {
        roomTypeDetailsRepository.save(roomTypeDetails);
    }

}
