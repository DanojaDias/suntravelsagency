package com.danoja.suntravels.services;

import com.danoja.suntravels.Dao.RoomTypeDetailsDao;
import com.danoja.suntravels.model.RoomTypeDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.sql.Date;
import java.util.List;

@Service
public class RoomTypeDetailsService {
    @Autowired
    RoomTypeDetailsDao roomTypeDetailsDao;

    @Transactional
    public List<RoomTypeDetails> getAllRoomTypeDetails() {
        return roomTypeDetailsDao.getAllRoomTypeDetails();
    }

    public List<RoomTypeDetails> findRoomTypesForOrder(int numberOfFreeRooms, Date checkInDate, Date EndDate, int adults){
        return roomTypeDetailsDao.findRoomTypesForOrder(numberOfFreeRooms, checkInDate, EndDate, adults);
    }

    public void addRoomTypeDetails(RoomTypeDetails roomTypeDetails) {
        roomTypeDetailsDao.addRoomTypeDetails(roomTypeDetails);
    }
}
