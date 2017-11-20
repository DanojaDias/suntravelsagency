package com.danoja.suntravels.repositories;

import com.danoja.suntravels.model.OrderRoomRequirement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRoomRequirementRepository extends JpaRepository<OrderRoomRequirement, Long> {
}
