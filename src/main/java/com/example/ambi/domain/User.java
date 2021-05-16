package com.example.ambi.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private int id;
    private String userName;
    private String passWord;

    public User(){

    }

    public User(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }
}
