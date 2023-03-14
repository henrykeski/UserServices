package com.learn.userservices.impl.dao;

import com.learn.userservices.impl.persistence.UserConfigurationPO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserConfigurationDAO extends JpaRepository<UserConfigurationPO, Integer> {

    UserConfigurationPO findByUserConfigurationId(Integer userConfigurationId);
}
