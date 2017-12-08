package com.danoja.suntravels.repositories;


import com.danoja.suntravels.model.Contract;
import com.danoja.suntravels.model.RoomTypeDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface ContractRepository extends JpaRepository<Contract, Long> {
    @Query("select u from Contract u where u.hotel.hotelId = ?1")
    List<Contract> getContractById(Long hotelId);
}
