package com.danoja.suntravels.Dao;

import com.danoja.suntravels.model.RoomRequirement;
import com.danoja.suntravels.repositories.RoomRequirementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
public class RoomRequirementDao {
    @Autowired
    RoomRequirementRepository roomRequirementRepository;

    public List<RoomRequirement> getAllRoomRequirement(){
        return roomRequirementRepository.findAll();
    }

    @Transactional
    public void addRoomRequirement(RoomRequirement roomRequirement) {
        roomRequirementRepository.save(roomRequirement);
    }
}
