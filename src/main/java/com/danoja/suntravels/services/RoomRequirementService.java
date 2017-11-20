package com.danoja.suntravels.services;

import com.danoja.suntravels.Dao.RoomRequirementDao;
import com.danoja.suntravels.model.RoomRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class RoomRequirementService {
    @Autowired
    RoomRequirementDao roomRequirementDao;

    @Transactional
    public List<RoomRequirement> getAllRoomRequirements() {
        return roomRequirementDao.getAllRoomRequirement();
    }

    public void addRoomRequirement(RoomRequirement roomRequirement) {
        roomRequirementDao.addRoomRequirement(roomRequirement);
    }

}
