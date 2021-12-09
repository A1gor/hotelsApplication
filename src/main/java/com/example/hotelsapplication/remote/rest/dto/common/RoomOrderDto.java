package com.example.hotelsapplication.remote.rest.dto.common;

public class RoomOrderDto {

    private Integer id;
    private Integer roomid;
    private Integer days;

    public RoomOrderDto() {
    }

    public RoomOrderDto(Integer id, Integer roomid, Integer days) {
        this.id = id;
        this.roomid = roomid;
        this.days = days;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }
}
