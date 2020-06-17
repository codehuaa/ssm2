package com.wzh.service;

import com.wzh.pojo.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();
    public int addUser(User user);
    public User getUserById(int id);
    public int update(User user);
    public int deleteUser(int id);
}
