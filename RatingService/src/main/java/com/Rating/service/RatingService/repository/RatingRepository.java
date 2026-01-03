package com.Rating.service.RatingService.repository;

import com.Rating.service.RatingService.Entity.Rating;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RatingRepository extends MongoRepository<Rating,String> {
//custom methods if any
    List<Rating> getRatingByHotelId(String hotelId);
    List<Rating> getRatingByUserId(String userId);

}
