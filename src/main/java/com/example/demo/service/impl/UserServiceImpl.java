package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.bean.User;
import com.example.demo.dao.UserDao;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
    private UserDao userDao;

    public User save( User user) {
        return userDao.save(user);
    }

}
