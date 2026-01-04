package com.user.service.UserService.Controller;


import com.user.service.UserService.Entities.User;
import com.user.service.UserService.Service.USerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private USerService userService;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User user1 =userService.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }
    //single user
    @GetMapping("/{userId}")
        public ResponseEntity<User> getSingleUSer(@PathVariable String userId) {
        User user = userService.getUser(userId);
        return ResponseEntity.ok(user);
    }
    @GetMapping("/all")
    public  ResponseEntity<List<User>> getAllUsers() {
        List<User> allusers = userService.findAll();
        return ResponseEntity.ok(allusers);
    }
}
