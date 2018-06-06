package com.lzr.api.controller;

import com.lzr.api.mapper.UserMapper;
import com.lzr.api.service.UserService;
import com.lzr.api.vo.User;
import com.lzr.api.vo.response.ResultResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/register")
    public ResultResponse<String> userRegistration() {
        User user = new User();
        user.setUserName("admin");
        user.setUserPassword("liuxinru1689");
        user.setUserLevel(0);
        ResultResponse<String> result = userService.userRegistration(user);
        return result;
    }
}
