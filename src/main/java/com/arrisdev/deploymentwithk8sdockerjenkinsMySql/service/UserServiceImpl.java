package com.arrisdev.deploymentwithk8sdockerjenkinsMySql.service;

import com.arrisdev.deploymentwithk8sdockerjenkinsMySql.model.User;
import com.arrisdev.deploymentwithk8sdockerjenkinsMySql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository repository;
    @Override
    public User createUser(User newUser) {
        return repository.save(newUser);
    }

    @Override
    public List<User> getAllUsers() {
        return repository.findAll();
    }

    @Override
    public List<User> findByFirstLetterOfName(String name) {
        List<User> users = repository.findAll();
        return users.stream()
                .filter(e -> e.getFirstName().startsWith(name))
                .collect(Collectors.toList());
    }

    @Override
    public List<User> findByEmail(String email) {
        List<User> users = repository.findByEmailId(email);
        return users;
    }
}
