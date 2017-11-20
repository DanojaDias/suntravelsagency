package com.danoja.suntravels.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "DD_ORDER")
public class Order implements Serializable {

    @EmbeddedId
    private OrderCustomerKey orderCustomerKey = new OrderCustomerKey();

    @Column(name = "TOTAL_PRICE")
    private int totalPrice;

    @MapsId("customerId")
    @ManyToOne
    @JoinColumn(name = "CUSTOMER_ID")
    private Customer customer;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL )
    @JsonIgnore
    private Set<Order> orders;

    public Order()
    {
    }


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public OrderCustomerKey getOrderCustomerKey() {
        return orderCustomerKey;
    }

    public Long getCustomerId()
    {
        return this.customer.getCustNic();
    }

    public void setCustomerId( Long customerId )
    {
        this.orderCustomerKey.setCustomerId(customerId);
        this.customer.setCustNic(customerId);
    }

    public void setOrderCustomerKey(OrderCustomerKey orderCustomerKey) {
        this.orderCustomerKey = orderCustomerKey;
    }

    public long getOrderId()
    {
        return this.orderCustomerKey.getOrderId();
    }

    public void setOrderId( long orderId )
    {
        this.orderCustomerKey.setOrderId(orderId);
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
