package com.example.demodynamiclogger.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    public UserDTO findUserDetails(String username){
        return UserDTO.builder()
                .userId(123)
                .firstName("Darshana")
                .lastName("Welikala")
                .build();
    }
}
