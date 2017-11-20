package com.danoja.suntravels.model;


import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class OrderRoomRequirementKey implements Serializable {
    private long orderId;
    private long roomRequirementId;

    public OrderRoomRequirementKey() {
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public long getRoomRequirementId() {
        return roomRequirementId;
    }

    public void setRoomRequirementId(long roomRequirementId) {
        this.roomRequirementId = roomRequirementId;
    }
}
