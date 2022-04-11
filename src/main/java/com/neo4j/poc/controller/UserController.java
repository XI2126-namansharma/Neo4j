package com.neo4j.poc.controller;


import com.neo4j.poc.entity.User;
import com.neo4j.poc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable String id) {
        return userService.getUserById(id);
    }

    @PostMapping("/users")
    public String addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @DeleteMapping("/users")
    public String deleteUser(@RequestBody User user) {
        return userService.deleteUser(user);
    }

    @DeleteMapping("/user/{id}")
    public String deleteUserById(@PathVariable String id) {
        return userService.deleteUserById(id);
    }
}
