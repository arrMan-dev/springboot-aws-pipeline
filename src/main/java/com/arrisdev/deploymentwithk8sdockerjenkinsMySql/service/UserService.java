package com.arrisdev.deploymentwithk8sdockerjenkinsMySql.service;

import com.arrisdev.deploymentwithk8sdockerjenkinsMySql.model.User;

import java.util.List;

public interface UserService {

    User createUser(User newUser);
    List<User> getAllUsers();

    List<User> findByFirstLetterOfName(String name);

    List<User> findByEmail(String email);
}
