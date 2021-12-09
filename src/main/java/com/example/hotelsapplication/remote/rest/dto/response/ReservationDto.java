package com.example.hotelsapplication.remote.rest.dto.response;



import com.example.hotelsapplication.remote.rest.dto.common.PersonReservationDto;
import com.example.hotelsapplication.remote.rest.dto.common.RoomOrderDto;

import java.util.List;

public class ReservationDto {
    private Integer id;
    private ReservationStatusDto status;
    private List<RoomOrderDto> pizzas;
    private PersonReservationDto person;

    public ReservationDto() {
    }

    public ReservationDto(Integer id, ReservationStatusDto status, List<RoomOrderDto> pizzas, PersonReservationDto person) {
        this.id = id;
        this.status = status;
        this.pizzas = pizzas;
        this.person = person;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ReservationStatusDto getStatus() {
        return status;
    }

    public void setStatus(ReservationStatusDto status) {
        this.status = status;
    }

    public List<RoomOrderDto> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<RoomOrderDto> pizzas) {
        this.pizzas = pizzas;
    }

    public PersonReservationDto getPerson() {
        return person;
    }

    public void setPerson(PersonReservationDto person) {
        this.person = person;
    }
}


