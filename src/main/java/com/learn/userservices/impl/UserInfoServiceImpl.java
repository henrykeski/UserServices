package com.learn.userservices.impl;

import com.learn.userservices.service.UserService;
import org.springframework.stereotype.Service;
import com.learn.userservices.domain.User;

@Service
public class UserInfoServiceImpl implements UserService {

    @Override
    public User getUserById() {
        User user = new User();
        user.setUserId(1);
        user.setFirstName("Donald");
        user.setLastName("Trump");

        return user;
    }

    @Override
    public String getName(){
        return "Hello World";
    }

}
