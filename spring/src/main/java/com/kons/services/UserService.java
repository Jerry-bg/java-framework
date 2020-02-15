package com.kons.services;

import com.kons.beans.User;
import com.kons.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {
    @Autowired
    private UserDao userDao;

    public User obtainUserById(int id) {
        return userDao.findUserById(id);
    }

    public void addUser(User user){
        userDao.addUser(user);
    }
}
