package com.danoja.suntravels.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "DD_ROOM_REQUIREMENT")
public class RoomRequirement {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long roomRequirementId;

    @ManyToOne
    @JoinColumn(name = "ROOM_TYPE_ID")
    private RoomType roomType;

    private int numberOfRooms;
    private Date checkInDate;
    private Date endDate;
    private int numberOfAdults;

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    private int numberOfNights;
    public RoomRequirement() {
    }

    public long getRoomRequirementId() {
        return roomRequirementId;
    }

    public void setRoomRequirementId(long roomRequirementId) {
        this.roomRequirementId = roomRequirementId;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getNumberOfAdults() {
        return numberOfAdults;
    }

    public void setNumberOfAdults(int numberOfAdults) {
        this.numberOfAdults = numberOfAdults;
    }
}
