package com.user.service.UserService.Dao;

import com.user.service.UserService.Controller.UserController;
import com.user.service.UserService.Entities.Rating;
import com.user.service.UserService.Entities.User;
import com.user.service.UserService.Exception.ResourceNotFoundException;
import com.user.service.UserService.Repository.UserRepository;
import com.user.service.UserService.Service.USerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.logging.Logger;

@Service
public class USerServiceImpl implements USerService {
  @Autowired
    private UserRepository userRepository;
    @Autowired
    private RestTemplate restTemplate;

    Logger log = Logger.getLogger(String.valueOf(UserController.class));


    @Override
    public User saveUser(User user) {
        //generate unique number
        String randomuserId= UUID.randomUUID().toString();
        user.setUserId(randomuserId);
         return userRepository.save(user);
        //return null;
    }

    @Override
    public List<User> findAll() {

        return userRepository.findAll();
    }

//    @Override
//    public User getUser(String userId) {
//       User  user=userRepository.findById(userId).orElseThrow(()->new ResourceNotFoundException("unable to found exception"));
//        return user;
//    }
    @Override
    public User getUserById(String userId) {
        User user = userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User with given id is not found" + userId));

        // http://localhost:8081/users/0ab8150e-8ed1-43b9-ba9a-b1c81350ee55
        ArrayList<Rating> forObject = restTemplate.getForObject("http://localhost:8081/users/"+userId, ArrayList.class);
        log.info("{ }" + forObject.toString());
        user.setRatings(forObject);
        return user;
    }

    //get all users with ratings
    @Override
    public List<User> findAllwithRatings() {

        List<User> users = userRepository.findAll();
        // http://localhost:8081/users/all
        ArrayList<Rating> AllRatings = restTemplate.getForObject("http://localhost:8081/users/all2/", ArrayList.class);
        log.info("{ }" + AllRatings.toString());
        users.forEach(user -> {
            List<Rating> userRatings = new ArrayList<>();
            for (Object obj : AllRatings) {
                // Assuming obj is a Map representing the Rating object
                // You may need to adjust this based on your actual Rating class structure
                Rating rating = new Rating();
                // Set properties of rating from obj map
                // e.g., rating.setRatingId((String)((Map)obj).get("ratingId"));
                // Add other properties similarly

                // Here we assume there's a method getUserId() in Rating class
                if (/*rating.getUserId().equals(user.getUserId())*/ true) { // Replace true with actual condition
                    userRatings.add(rating);
                }
            }
            user.setRatings(userRatings);
        });
        log.info("{ }" + AllRatings.toString());
        return users;
    }
}
