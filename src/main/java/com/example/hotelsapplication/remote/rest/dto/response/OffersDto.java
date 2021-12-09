package com.example.hotelsapplication.remote.rest.dto.response;

import java.util.List;
public class OffersDto {
    private List<HotelDto> Hotel;

    public OffersDto() {
    }

    public OffersDto(List<HotelDto> hotel) {
        Hotel = hotel;
    }

    public List<HotelDto> getHotel() {
        return Hotel;
    }

    public void setHotel(List<HotelDto> hotel) {
        Hotel = hotel;
    }
}
