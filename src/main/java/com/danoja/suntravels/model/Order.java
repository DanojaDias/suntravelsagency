package com.danoja.suntravels.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "DD_ORDER")
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "ORDER_ID")
    private long orderId;

    @Column(name = "TOTAL_PRICE")
    private int totalPrice;


    @ManyToOne
    @JoinColumn(name = "CUSTOMER_ID", referencedColumnName="CUST_NIC")
    private Customer customer;

//    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL )
//    @JsonIgnore
//    private Set<Order> orders;

    public Order()
    {
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public long getCustomerId()
    {
        return customer.getCustNic();
    }

    public void setCustomerId( long customerId )
    {
        this.customer.setCustNic(customerId);
    }

    public long getOrderId()
    {
        return orderId;
    }

    public void setOrderId( long orderId )
    {
        this.orderId = orderId;
    }

    public int getTotalPrice()
    {
        return this.totalPrice;
    }

    public void setTotalPrice( int totalPrice )
    {
        this.totalPrice = totalPrice;
    }

}
