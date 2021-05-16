package com.example.ambi.mapper;

import com.example.ambi.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    void insertUser(User user);
}
