package com.Rating.service.RatingService.Repository;

import com.Rating.service.RatingService.Entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingRepository extends JpaRepository<Rating, Integer> {
//custom methods if any
    List<Rating> getRatingByHotelId(String hotelId);
    List<Rating> getRatingByUserId(String userId);

}
