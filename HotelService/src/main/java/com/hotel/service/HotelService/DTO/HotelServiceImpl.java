package com.hotel.service.HotelService.DTO;

import com.hotel.service.HotelService.Entity.Hotel;
import com.hotel.service.HotelService.Exception.ResourceNotFoundException;
import com.hotel.service.HotelService.Repositries.HotelRepository;
import com.hotel.service.HotelService.Service.HotelService;
import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    HotelRepository hotelRepository;
    @Override
    public Hotel createHotel(Hotel hotel) {
        //return "";
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> get() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel findByName(String name) {
        return hotelRepository.findAllByName(name); //.orElseThrow(()-> new ResourceNotFoundException("Hotel not found"));
    }

    @Override
    public @Nullable Hotel findHotelById(String hotelId) {
        return hotelRepository.findAllByName(hotelId);
    }
}
