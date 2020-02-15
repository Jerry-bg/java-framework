package com.kons.dao;

import com.kons.beans.User;

public interface UserDao {
    User findUserById(int id);
    void addUser(User user);
}
