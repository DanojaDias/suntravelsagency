package com.danoja.suntravels.repositories;

import com.danoja.suntravels.model.Hotel;
import com.danoja.suntravels.model.RoomRequirement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRequirementRepository extends JpaRepository<RoomRequirement, Long> {

//    @Query("select u from User u where u.emailAddress = ?1")
//    List<RoomRequirement> findRoomTypesForOrder(String rooms);
}
