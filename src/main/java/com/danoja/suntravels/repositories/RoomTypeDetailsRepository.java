package com.danoja.suntravels.repositories;

import com.danoja.suntravels.model.RoomTypeDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomTypeDetailsRepository extends JpaRepository<RoomTypeDetails, Long> {
     @Query("select u from User u where u.numberOfFreeRooms = ?1")
     List<RoomTypeDetails> findRoomTypesForOrder(int numberOfFreeRooms);


}
