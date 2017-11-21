package com.danoja.suntravels.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "DD_ROOM_REQUIREMENT")
public class RoomRequirement {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "ROOM_REQUIREMENT_ID")
    private long roomRequirementId;

    @ManyToOne
    @JoinColumn(name = "ROOM_TYPE_ID")
    private RoomType roomType;

    @Column(name = "NUMBER_OF_ROOMS")
    private int numberOfRooms;

    @Column(name = "CHECK_IN_DATE")
    private Date checkInDate;

    @Column(name = "END_DATE")
    private Date endDate;

    @Column(name = "NUMBER_OF_ADULTS")
    private int numberOfAdults;

    @Column(name = "NUMBER_OF_NIGHTS")
    private int numberOfNights;
//
//    @OneToMany(mappedBy = "roomRequirement", cascade = CascadeType.ALL )
//    @JsonIgnore
//    private Set<RoomRequirement> roomRequirement;


    public RoomRequirement() {
    }

//    public Set<RoomRequirement> getRoomRequirement() {
//        return roomRequirement;
//    }
//
//    public void setRoomRequirement(Set<RoomRequirement> roomRequirement) {
//        this.roomRequirement = roomRequirement;
//    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
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
