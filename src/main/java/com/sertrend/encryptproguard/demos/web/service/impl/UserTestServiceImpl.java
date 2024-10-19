package com.sertrend.encryptproguard.demos.web.service.impl;

import com.sertrend.encryptproguard.demos.web.entity.UserTest;
import com.sertrend.encryptproguard.demos.web.service.UserTestService;
import org.springframework.stereotype.Service;

@Service
public class UserTestServiceImpl implements UserTestService {

    @Override
    public UserTest getUserById(String id) {
        return null;
    }

    @Override
    public void deleteUserById(String id) {

    }

    @Override
    public void updateUserById(String id) {

    }

    @Override
    public int addUser(UserTest user) {
        return 0;
    }
}
