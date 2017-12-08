package com.danoja.suntravels.repositories;

import com.danoja.suntravels.model.RoomType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomTypeRepository extends JpaRepository<RoomType, Long> {
    @Query("select u from RoomType u where u.roomTypeId = ?1")
    List<RoomType> getRoomTypeById( Long RoomTypeId);
}
