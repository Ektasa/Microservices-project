package com.user.service.UserService.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Rating {
    private String userId;
    private String ratingId;
    private String hotelId;
    private int rating;
    private String feedback;
}
