package com.danoja.suntravels.model;

import javax.persistence.*;
import java.sql.*;

@Entity
@Table(name = "DD_CONTRACT")
public class Contract{

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name = "CONTRACT_ID")
 	private long contractId;

    @ManyToOne
    @JoinColumn(name = "HOTEL_ID")
	private Hotel hotel;

    @Column(name ="MARKUP")
	private float markup;

    @Column(name = "VALID_FROM")
	private Date validFrom;

    @Column(name = "VALID_TO")
	private Date validTo;

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

	public Date getValidFrom()
	{
		return this.validFrom;
	}

	public void setValidFrom( Date validFrom )
	{
		this.validFrom = validFrom;
	}

	public Date getValidTo()
	{
		return this.validTo;
	}

	public void setValidTo( Date validTo )
	{
		this.validTo = validTo;
	}

	public Hotel getHotel()
	{
		return this.hotel;
	}

	public void setHotel( Hotel hotel )
	{
		this.hotel = hotel;
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
