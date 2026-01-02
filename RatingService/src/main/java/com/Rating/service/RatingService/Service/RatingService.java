package com.Rating.service.RatingService.Service;

import com.Rating.service.RatingService.Entity.Rating;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;


public interface RatingService {

    //create
    Rating createRating(Rating rating);
    // get all
    List<Rating> getRating();
    //get all by userID
    List<Rating> getRatingByUserId(String userId);
    //get all by hotelID
    List<Rating> getRatingByHotelId(String hotelId);
}
