package com.user.service.UserService.Service;

import com.user.service.UserService.Entities.User;

import java.util.List;

public interface USerService {
    //User findByUsername(String username);
    User saveUser(User user);
    List<User> findAll();
    //User getUser(String userId);
    User getUserById(String userId);

    List<User> getAllUser();

    //get single user
    User getUser(String userId);

    //get all users with ratings
    //List<User> findAllwithRatings();
    //delete
    //update
}
