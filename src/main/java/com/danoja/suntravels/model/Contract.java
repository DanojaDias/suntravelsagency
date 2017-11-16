package com.danoja.suntravels.model;
import javax.persistence.*;
import java.sql.*;

@Entity
@Table(name = "DD_CONTRACT")
public class Contract{

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
 	private long contractId;
	private long hotelId;
	private float markup;
	private Timestamp validFrom;
	private Timestamp validTo;

	public Contract()
	{
	}

	public long getContractId()
	{
		return this.contractId;
	}

	public void setContractId( long contractId )
	{
		this.contractId = contractId;
	}

	public Timestamp getValidFrom()
	{
		return this.validFrom;
	}

	public void setValidFrom( Timestamp validFrom )
	{
		this.validFrom = validFrom;
	}

	public Timestamp getValidTo()
	{
		return this.validTo;
	}

	public void setValidTo( Timestamp validTo )
	{
		this.validTo = validTo;
	}

	public long getHotelId()
	{
		return this.hotelId;
	}

	public void setHotelId( long hotelId )
	{
		this.hotelId = hotelId;
	}

	public float getMarkup()
	{
		return this.markup;
	}

	public void setMarkup( float markup )
	{
		this.markup = markup;
	}
}
