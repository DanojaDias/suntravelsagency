package com.danoja.suntravels.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "DD_CUSTOMER")
public class Customer {

    @Id
    @Column(name = "CUST_NIC")
    private long custNic;

    @Column(name = "CUST_NAME")
    private String custName;

    @Column(name = "CUST_TP")
    private long custTp;

    @Column(name = "CUST_STREET")
    private String custStreet;

    @Column(name = "CUST_CITY")
    private String custCity;

    @Column(name = "CUST_STATE")
    private String custState;

    @Column(name = "CUST_ZIP")
    private String custZip;

    @Column(name = "CUST_COUNTRY")
    private String custCountry;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL )
    @JsonIgnore
    private Set<Order> order;


    public Customer()
    {
    }

    public Set<Order> getOrder() {
        return order;
    }

    public void setOrder(Set<Order> order) {
        order = order;
    }

    public long getCustNic()
    {
        return this.custNic;
    }

    public void setCustNic( long custNic )
    {
        this.custNic = custNic;
    }

    public String getCustName()
    {
        return this.custName;
    }

    public void setCustName( String custName )
    {
        this.custName = custName;
    }

    public long getCustTp()
    {
        return this.custTp;
    }

    public void setCustTp( long custTp )
    {
        this.custTp = custTp;
    }

    public String getCustStreet()
    {
        return this.custStreet;
    }

    public void setCustStreet( String custStreet )
    {
        this.custStreet = custStreet;
    }

    public String getCustCity()
    {
        return this.custCity;
    }

    public void setCustCity( String custCity )
    {
        this.custCity = custCity;
    }

    public String getCustState()
    {
        return this.custState;
    }

    public void setCustState( String custState )
    {
        this.custState = custState;
    }

    public String getCustZip()
    {
        return this.custZip;
    }

    public void setCustZip( String custZip )
    {
        this.custZip = custZip;
    }

    public String getCustCountry()
    {
        return this.custCountry;
    }

    public void setCustCountry( String custCountry )
    {
        this.custCountry = custCountry;
    }
}
