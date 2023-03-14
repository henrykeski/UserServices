package com.learn.userservices.impl;

import com.learn.userservices.domain.User;
import com.learn.userservices.impl.dao.UserConfigurationDAO;
import com.learn.userservices.impl.persistence.UserConfigurationPO;
import com.learn.userservices.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserService {

    @Autowired
    UserConfigurationDAO userConfigurationDAO;

    @Override
    public User getUserById() {
        User user = new User();
        user.setFirstName("Donald");
        user.setLastName("Trump");

        return user;
    }

    @Override
    public String getName() {
        return "Hello World";
    }

    @Override
    public void addUser(User user) {
        UserConfigurationPO userConfigurationPO = new UserConfigurationPO();
        userConfigurationPO.setEmail("dougJ@gmail.com");
        userConfigurationPO.setPassword("Password1");
        userConfigurationPO.setFirstName("John");
        userConfigurationPO.setLastName("Jones");
        userConfigurationPO.setPortfolioId(1);
        userConfigurationPO.setAuthorizationType("Standard_User");

        userConfigurationDAO.save(userConfigurationPO);
    }

}
