package com.user.service.UserService.Dao;

import com.user.service.UserService.Entities.User;
import com.user.service.UserService.Exception.ResourceNotFoundException;
import com.user.service.UserService.Repository.UserRepository;
import com.user.service.UserService.Service.USerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class USerServiceImpl implements USerService {
  @Autowired
    private UserRepository userRepository;

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

    @Override
    public User getUser(String userId) {
        return userRepository.findById(userId).orElseThrow(()->new ResourceNotFoundException("unable to found exception"));
    }
}
