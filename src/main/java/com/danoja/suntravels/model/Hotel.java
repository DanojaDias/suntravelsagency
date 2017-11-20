package com.danoja.suntravels.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

/**
 * Created by jt on 1/10/17.
 */
@Entity
@Table(name = "DD_HOTEL")
public class Hotel {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long hotelId;

    @Column(name = "HOTEL_NAME")
    private String hotelName;

    @Column(name = "HOTEL_TP")
    private String hotelTp;

    @Column(name="HOTEL_CITY")
    private String hotelCity;

    @Column(name="HOTEL_STATE")
    private String hotelState;

    @Column(name="HOTEL_ZIP")
    private String hotelZip;

    @Column(name="HOTEL_STREET")
    private String hotelStreet;

    @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL )
    @JsonIgnore
    private Set<Contract> contracts;

    @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL )
    @JsonIgnore
    private Set<RoomType> roomType;


    public Hotel()
    {
    }

    public long getHotelId()
    {
        return this.hotelId;
    }

    public void setHotelId( long hotelId )
    {
        this.hotelId = hotelId;
    }

    public String getHotelName()
    {
        return this.hotelName;
    }

    public void setHotelName( String hotelName )
    {
        this.hotelName = hotelName;
    }

    public String getHotelTp()
    {
        return this.hotelTp;
    }

    public void setHotelTp( String hotelTp )
    {
        this.hotelTp = hotelTp;
    }

    public String getHotelCity()
    {
        return this.hotelCity;
    }

    public void setHotelCity( String hotelCity )
    {
        this.hotelCity = hotelCity;
    }

    public String getHotelState()
    {
        return this.hotelState;
    }

    public void setHotelState( String hotelState )
    {
        this.hotelState = hotelState;
    }

    public String getHotelZip()
    {
        return this.hotelZip;
    }

    public void setHotelZip( String hotelZip )
    {
        this.hotelZip = hotelZip;
    }

    public String getHotelStreet()
    {
        return this.hotelStreet;
    }

    public void setHotelStreet( String hotelStreet )
    {
        this.hotelStreet = hotelStreet;
    }


    public Set<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(Set<Contract> contracts) {
        this.contracts = contracts;
    }

    public Set<RoomType> getRoomType() {
        return roomType;
    }

    public void setRoomType(Set<RoomType> roomType) {
        this.roomType = roomType;
    }
}
