package com.example.ambi.controller;

import com.example.ambi.domain.User;
import com.example.ambi.service.UserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserSerivce userSerivce;

    @Autowired
    public UserController(UserSerivce userSerivce) {
        this.userSerivce = userSerivce;
    }

    @PostMapping
    public ResponseEntity insertUser(@RequestBody  User user) {
        userSerivce.insertUser(user);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
