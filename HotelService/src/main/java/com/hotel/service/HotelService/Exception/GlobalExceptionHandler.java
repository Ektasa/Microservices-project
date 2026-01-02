package com.hotel.service.HotelService.Exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    public ResponseEntity<Map<String, Object>> notfoundHandler(ResourceNotFoundException exception) {
     Map map = new HashMap<>();
        map.put("message", exception.getMessage());
        return ResponseEntity.status(404).body(map);
    }
}
