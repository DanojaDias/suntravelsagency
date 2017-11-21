package com.danoja.suntravels.model;

import com.danoja.suntravels.repositories.OrderRoomRequirementRepository;

import javax.persistence.*;

@Entity
@Table(name = "DD_ORDER_ROOM_REQUIREMENT")
public class OrderRoomRequirement {

    @EmbeddedId
    private OrderRoomRequirementKey orderRoomRequirementKey = new OrderRoomRequirementKey();

    @MapsId("orderId")
    @ManyToOne
    @JoinColumn(name = "ORDER_ID", referencedColumnName="ORDER_ID",  insertable=false, updatable=false)
    private Order order;

    @MapsId("roomRequirementId")
    @ManyToOne
    @JoinColumn(name = "ROOM_REQUIREMENT_ID")
    private RoomRequirement roomRequirement;

    public OrderRoomRequirement()
    {
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public RoomRequirement getRoomRequirement() {
        return roomRequirement;
    }

    public void setRoomRequirement(RoomRequirement roomRequirement) {
        this.roomRequirement = roomRequirement;
    }

    public long getOrderId() {
        return order.getOrderId();
    }

    public void setOrderId(long orderId) {
        this.order.setOrderId(orderId);
        this.orderRoomRequirementKey.setOrderId(orderId);
    }

    public long getRoomRequirementId() {
        return this.roomRequirement.getRoomRequirementId();
    }

    public void setRoomRequirementId(long roomRequirementId) {
        this.roomRequirement.setRoomRequirementId(roomRequirementId);
        this.orderRoomRequirementKey.setRoomRequirementId(roomRequirementId);
    }


    public OrderRoomRequirementKey getOrderRoomRequirementKey() {
        return orderRoomRequirementKey;
    }

    public void setOrderRoomRequirementKey(OrderRoomRequirementKey orderRoomRequirementKey) {
        this.orderRoomRequirementKey = orderRoomRequirementKey;
    }
}
