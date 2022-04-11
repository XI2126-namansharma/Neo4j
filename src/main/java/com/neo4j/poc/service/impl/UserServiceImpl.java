package com.neo4j.poc.service.impl;

import com.neo4j.poc.entity.User;
import com.neo4j.poc.repository.UserRepository;
import com.neo4j.poc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public String addUser(User user) {
        userRepository.save(user);
        return "User Saved Successfully!!!";
    }

    @Override
    public String deleteUser(User user) {
        userRepository.delete(user);
        return "User Deleted Successfully!!!";
    }

    @Override
    public String deleteUserById(String id) {
        userRepository.deleteById(id);
        return "User Deleted Successfully!!!";
    }

    @Override
    public User getUserById(String id) {
        Optional<User> user = userRepository.findById(id);
        return user.orElse(null);
    }
}
