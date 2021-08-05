package com.example.ambi.controller;

import com.example.ambi.domain.User;
import com.example.ambi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity insertUser(@RequestBody User user) {
        userService.insertUser(user);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity hello() {
        return new ResponseEntity<>("Hello from docker",HttpStatus.OK);
    }

}