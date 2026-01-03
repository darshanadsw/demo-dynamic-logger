package com.example.demodynamiclogger.service;

import com.example.demodynamiclogger.dao.UserDTO;
import com.example.demodynamiclogger.dao.UserDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MyBusinessService {

    private final UserDao userDao;

    public String performSlowOperation(String user) {
        final UserDTO userDetails = userDao.findUserDetails(user);
        return userDetails.getFirstName();
    }

    public String performQuickOperation(String user) {
        return user;
    }
}
