package com.example.ambi.service.impl;

import com.example.ambi.domain.User;
import com.example.ambi.mapper.UserMapper;
import com.example.ambi.service.UserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserSerivce {
    private UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }


    @Override
    public void insertUser(User user) {
        userMapper.insertUser(user);
    }
}
