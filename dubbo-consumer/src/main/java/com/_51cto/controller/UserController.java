package com._51cto.controller;

import _51cto.entity.User;
import _51cto.service.UserService;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    //@Autowired  这里不能够Autowired，因为在该项目中我们是不能够找到UserService的bean
    private UserService userService;//同时，因为它是私有的，所以我们要定义setter方法

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void findById(Integer id) {
        User user = userService.findById(id);
        System.out.println(user.toString());
    }

    public void setUserServiceConstuctorMethod(String userServiceConstuctorMethod) {
    }
}
