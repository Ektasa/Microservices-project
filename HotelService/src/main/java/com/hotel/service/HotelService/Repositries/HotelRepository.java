package com.hotel.service.HotelService.Repositries;

import com.hotel.service.HotelService.Entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, Integer> {
    Hotel findAllByName(String name);
}
