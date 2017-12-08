package com.danoja.suntravels.services;

import com.danoja.suntravels.Dao.RoomTypeDao;
import com.danoja.suntravels.model.RoomType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class RoomTypeService {
    @Autowired
    RoomTypeDao roomTypeDao;

    @Transactional
    public List<RoomType> getAllRoomTypes() {
        return roomTypeDao.getAllRoomTypes();
    }



    public long addRoomType(RoomType roomType) {
        return roomTypeDao.addRoomType(roomType);
    }

    public RoomType getRoomTypeById(Long id) {
        return roomTypeDao.getRoomTypeById(id);
    }

}
