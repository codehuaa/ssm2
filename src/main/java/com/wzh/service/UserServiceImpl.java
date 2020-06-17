package com.wzh.service;

import com.wzh.mapper.UserMapper;
import com.wzh.pojo.User;

import java.util.List;

public class UserServiceImpl implements UserService{
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }

    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    public User getUserById(int id) {
        return userMapper.getUserById(id);
    }

    public int update(User user) {
        return userMapper.update(user);
    }

    public int deleteUser(int id) {
        return userMapper.deleteUser(id);
    }
}
