package com.danoja.suntravels.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="DD_ROOM_TYPE")
public class RoomType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ROOM_TYPE_ID")
    private long roomTypeId;

    @Column(name = "ROOM_TYPE_NAME")
    private String roomTypeName;

    @Column(name = "ROOM_TYPE_DESC")
    private String roomTypeDesc;

    @ManyToOne
    @JoinColumn(name = "HOTEL_ID")
    private Hotel hotel;

    @OneToMany(mappedBy = "roomType", cascade = CascadeType.ALL )
    @JsonIgnore
    private Set<RoomType> roomType;

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

    public Set<RoomType> getRoomType() {
        return roomType;
    }

    public void setRoomType(Set<RoomType> roomTypes) {
        this.roomType = roomTypes;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }


}
