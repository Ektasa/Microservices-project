package com.Rating.service.RatingService.Entity;

//import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;


@Getter
@Setter




@Document(collection = "ratings")
public class Rating {

    private String ratingId;

    public Rating() {
        this.ratingId = UUID.randomUUID().toString();
    }
        private String userId;
    private String hotelId;
    private int rating;
    private String feedback;


}
