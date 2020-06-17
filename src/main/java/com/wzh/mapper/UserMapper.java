package com.wzh.mapper;

import com.wzh.pojo.User;

import java.util.List;

public interface UserMapper {
    public List<User> getAllUsers();

    public User getUserById(int id);

    public int addUser(User user);

    public int update(User user);

    public int deleteUser(int id);
}
