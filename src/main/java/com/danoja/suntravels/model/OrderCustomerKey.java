package com.danoja.suntravels.model;

import javax.persistence.*;
import java.io.Serializable;


@Embeddable
public class OrderCustomerKey implements Serializable {

    @Column(name = "CUSTOMER_ID")
    private Long customerId;

    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "ORDER_ID")
    private long orderId;


    public OrderCustomerKey() {
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
}
