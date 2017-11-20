package com.danoja.suntravels.Dao;

import com.danoja.suntravels.model.OrderRoomRequirement;
import com.danoja.suntravels.model.OrderRoomRequirement;
import com.danoja.suntravels.repositories.OrderRoomRequirementRepository;
import com.danoja.suntravels.repositories.OrderRoomRequirementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
public class OrderRoomRequirementDao {
    @Autowired
    OrderRoomRequirementRepository orderRoomRequirementRepository;

    public List<OrderRoomRequirement> getAllOrderRoomRequirements(){
        return orderRoomRequirementRepository.findAll();
    }

    @Transactional
    public void addOrderRoomRequirement(OrderRoomRequirement orderRoomRequirement) {
        orderRoomRequirementRepository.save(orderRoomRequirement);
    }
}
