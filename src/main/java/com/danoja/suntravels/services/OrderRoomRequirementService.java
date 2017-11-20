package com.danoja.suntravels.services;

import com.danoja.suntravels.Dao.OrderRoomRequirementDao;
import com.danoja.suntravels.model.OrderRoomRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class OrderRoomRequirementService {

    @Autowired
    OrderRoomRequirementDao orderRoomRequirementDao;

    @Transactional
    public List<OrderRoomRequirement> getAllOrderRoomRequirements() {
        return orderRoomRequirementDao.getAllOrderRoomRequirements();
    }



    public void addOrderRoomRequirement(OrderRoomRequirement orderRoomRequirement) {
        orderRoomRequirementDao.addOrderRoomRequirement(orderRoomRequirement);
    }

}
