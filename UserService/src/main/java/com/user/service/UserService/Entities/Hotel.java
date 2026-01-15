package com.user.service.UserService.Entities;


import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Hotel {

    private String hotelId;
    private String name;
    private String location;
    private String about;

}
