package com.neo4j.poc.service;

import com.neo4j.poc.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    String addUser(User user);
    String deleteUser(User user);
    String deleteUserById(String id);
    User getUserById(String id);
}
