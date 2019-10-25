package com._51cto.service;

import _51cto.entity.User;

public class UserServiceImpl implements _51cto.service.UserService {

    public User findById(int id) {
        System.out.println("UserServierImpl.findById() ");
        User user = new User();
        user.setId(id);
        user.setName("汤小洋");
        user.setPassword("123");
        return user;
    }
}
