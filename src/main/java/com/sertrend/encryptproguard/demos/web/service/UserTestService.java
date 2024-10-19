package com.sertrend.encryptproguard.demos.web.service;

import com.sertrend.encryptproguard.demos.web.entity.UserTest;

public interface UserTestService {

     UserTest getUserById(String id);

    void deleteUserById(String id);

    void updateUserById(String id);

    int addUser(UserTest user);
}
