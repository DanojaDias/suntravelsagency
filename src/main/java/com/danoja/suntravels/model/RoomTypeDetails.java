package com.danoja.suntravels.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;


@Table(name="DD_ROOM_TYPE_DETAILS")
@Entity
public class RoomTypeDetails {

    @EmbeddedId
    private RoomTypeDetailsKey roomTypeDetailsKey = new RoomTypeDetailsKey();


    @MapsId("contractId")
    @ManyToOne
    @JoinColumn(name = "CONTRACT_ID", referencedColumnName = "CONTRACT_ID", insertable = false, updatable = false)
    private Contract contract;

    @MapsId("roomTypeId")
    @ManyToOne
    @JoinColumn(name = "ROOM_TYPE_ID", referencedColumnName = "ROOM_TYPE_ID", insertable = false, updatable = false)
    private RoomType roomType;

    @Column(name ="MAX_ADULTS")
    private long maxAdults;

    @Column(name="RATE")
    private int rate;

    @Column(name="NUMBER_OF_TOTALL_ROOMS")
    private long numberOfTotallRooms;

    @Column(name = "NUMBER_OF_FREE_ROOMS")
    private long numberOfFreeRooms;

    public RoomTypeDetails()
    {
    }

    public Long getRoomTypeId()
    {
        return this.roomType.getRoomTypeId();
    }

    public void setRoomTypeId( Long roomTypeId )
    {
        this.roomTypeDetailsKey.setRoomTypeId(roomTypeId);
        this.roomType.setRoomTypeId(roomTypeId);
    }

    public Long getContractId()
    {
        return this.contract.getContractId();
    }

    public void setContractId( Long contractId )
    {
        this.roomTypeDetailsKey.setContractId(contractId);
        this.contract.setContractId(contractId);
    }

    public RoomTypeDetailsKey getRoomTypeDetailsKey()
    {
        return this.roomTypeDetailsKey;
    }

    public void setRoomTypeDetailsKey( RoomTypeDetailsKey roomTypeDetailsKey )
    {
        this.roomTypeDetailsKey = roomTypeDetailsKey;
    }


    public RoomType getRoomType() {
        return roomType;
    }


    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public long getMaxAdults()
    {
        return this.maxAdults;
    }

    public void setMaxAdults( long maxAdults )
    {
        this.maxAdults = maxAdults;
    }

    public int getRate()
    {
        return this.rate;
    }

    public void setRate( int rate )
    {
        this.rate = rate;
    }

    public long getNumberOfTotallRooms()
    {
        return this.numberOfTotallRooms;
    }

    public void setNumberOfTotallRooms( long numberOfTotallRooms )
    {
        this.numberOfTotallRooms = numberOfTotallRooms;
    }

    public long getNumberOfFreeRooms()
    {
        return this.numberOfFreeRooms;
    }

    public void setNumberOfFreeRooms( long numberOfFreeRooms )
    {
        this.numberOfFreeRooms = numberOfFreeRooms;
    }


}
