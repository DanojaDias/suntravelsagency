package com.danoja.suntravels.model;

import javax.persistence.*;

@Entity
@Table(name="DD_ROOM_TYPE")
public class RoomType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ROOM_TYPE_ID")
    private long roomTypeId;
    private String roomTypeName;
    private String roomTypeDesc;

    @ManyToOne
    @JoinColumn(name = "HOTEL_ID")
    private Hotel hotel;


    public RoomType()
    {
    }
    public long getRoomTypeId()
    {
        return this.roomTypeId;
    }

    public void setRoomTypeId( long roomTypeId )
    {
        this.roomTypeId = roomTypeId;
    }

    public String getRoomTypeName()
    {
        return this.roomTypeName;
    }

    public void setRoomTypeName( String roomTypeName )
    {
        this.roomTypeName = roomTypeName;
    }

    public String getRoomTypeDesc()
    {
        return this.roomTypeDesc;
    }

    public void setRoomTypeDesc( String roomTypeDesc )
    {
        this.roomTypeDesc = roomTypeDesc;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }


}
