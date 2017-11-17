package com.danoja.suntravels.repositories;

import com.danoja.suntravels.model.RoomTypeDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomTypeDetailsRepository extends JpaRepository<RoomTypeDetails, Long> {
}
