package com.arrisdev.deploymentwithk8sdockerjenkinsMySql.controller;

import com.arrisdev.deploymentwithk8sdockerjenkinsMySql.model.User;
import com.arrisdev.deploymentwithk8sdockerjenkinsMySql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/create")
    public ResponseEntity<User> saveUser(@RequestBody User user){
        return ResponseEntity.ok(service.createUser(user));
    }

    @GetMapping("/all")
    public ResponseEntity<List<User>> findAll(){
        return ResponseEntity.ok(service.getAllUsers());
    }

    @GetMapping("/users/{input}")
    public ResponseEntity<List<User>> findUserByNameStartWithInput(@PathVariable("input") String input){
        return ResponseEntity.ok(service.findByFirstLetterOfName(input));
    }
    @GetMapping("/users/{emailId}/fetch")
    public ResponseEntity<List<User>> findUserByEmail(@PathVariable("emailId") String email){
        return ResponseEntity.ok(service.findByEmail(email));
    }
}
