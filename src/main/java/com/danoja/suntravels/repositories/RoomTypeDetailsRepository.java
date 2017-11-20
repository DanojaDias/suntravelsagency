package com.danoja.suntravels.repositories;

import com.danoja.suntravels.model.RoomTypeDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface RoomTypeDetailsRepository extends JpaRepository<RoomTypeDetails, Long> {
     @Query("select u from RoomTypeDetails u where u.numberOfFreeRooms >= ?1 AND u.contract.validFrom < ?2 AND u.contract.validTo > ?3 AND u.maxAdults >= ?4")
     List<RoomTypeDetails> findRoomTypesForOrder(int numberOfFreeRooms, Date checkInDate, Date EndDate, int adults);
}
