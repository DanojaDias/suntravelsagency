package com.danoja.suntravels.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class RoomTypeDetailsKey implements Serializable {


    @Column(name = "CONTRACT_ID")
    private Long contractId;

    @Column(name = "ROOM_TYPE_ID")
    private Long roomTypeId;

    public RoomTypeDetailsKey(Long contractId, Long roomTypeId){
        this.roomTypeId = roomTypeId;
        this.contractId = contractId;

    }

    public RoomTypeDetailsKey() {
    }

    public Long getContractId(){
        return this.contractId;
    }
    public void setContractId(Long contractId){
        this.contractId = contractId;
    }
    public Long getRoomTypeId(){
        return this.roomTypeId;
    }
    public void setRoomTypeId(Long roomTypeId){
        this.roomTypeId = roomTypeId;
    }
}
