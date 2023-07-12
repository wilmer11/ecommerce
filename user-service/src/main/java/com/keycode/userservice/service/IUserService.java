package com.keycode.userservice.service;

import com.keycode.userservice.entity.User;

import java.util.List;

public interface IUserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    User getUserByName(String userName);
    User saveUser(User user);
}
