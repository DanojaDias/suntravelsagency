package com.danoja.suntravels.model;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by jt on 1/10/17.
 */
@Entity
@Table(name = "DD_HOTEL")
public class Hotel {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long hotelId;
    private String hotelName;
    private String hotelTp;
    private String hotelCity;
    private String hotelState;
    private String hotelZip;
    private String hotelStreet;
    private int status;

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

    public int getStatus()
    {
        return this.status;
    }

    public void setStatus( int status )
    {
        this.status = status;
    }

}
