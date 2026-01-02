package com.hotel.service.HotelService.Controllers;


import com.hotel.service.HotelService.Entity.Hotel;
import com.hotel.service.HotelService.Service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    //create hotel

    @PostMapping
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel) {
        String hotelIds = UUID.randomUUID().toString();
        hotel.sethotelId(hotelIds);
        return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.createHotel(hotel));
    }

    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel> getHotelById(@PathVariable String hotelId) {
        return ResponseEntity.status(HttpStatus.OK).body(hotelService.findHotelById(hotelId));
    }

    @GetMapping("/all")
    public ResponseEntity<List<Hotel>> findHotelByName() {
        return ResponseEntity.ok(hotelService.get());
    }
}
