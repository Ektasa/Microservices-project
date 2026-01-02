package com.hotel.service.HotelService.Service;

import com.hotel.service.HotelService.Entity.Hotel;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface HotelService  {

    //create
    Hotel createHotel(Hotel hotel);
    //getall
    List<Hotel> get();

    //get single
    Hotel findByName(String name);

    @Nullable Hotel findHotelById(String hotelId);
}
