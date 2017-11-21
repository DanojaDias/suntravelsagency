package com.danoja.suntravels.model;


import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class OrderRoomRequirementKey implements Serializable {
    private Long orderId;
    private Long roomRequirementId;

    public OrderRoomRequirementKey() {
    }

    public OrderRoomRequirementKey(Long orderId, Long roomRequirementId) {
        this.orderId = orderId;
        this.roomRequirementId = roomRequirementId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getRoomRequirementId() {
        return roomRequirementId;
    }

    public void setRoomRequirementId(Long roomRequirementId) {
        this.roomRequirementId = roomRequirementId;
    }
}
