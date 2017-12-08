package com.danoja.suntravels.Dao;

import com.danoja.suntravels.model.Hotel;
import com.danoja.suntravels.model.RoomType;
import com.danoja.suntravels.repositories.RoomTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
public class RoomTypeDao {
    @Autowired
    RoomTypeRepository roomTypeRepository;

    public List<RoomType> getAllRoomTypes(){
        return roomTypeRepository.findAll();
    }

    @Transactional
    public long addRoomType( RoomType roomType) {
        roomTypeRepository.save(roomType);
        roomTypeRepository.flush();
        return roomType.getRoomTypeId();

    }

    public RoomType getRoomTypeById( Long id){
        return roomTypeRepository.findOne(id);
    }
}
