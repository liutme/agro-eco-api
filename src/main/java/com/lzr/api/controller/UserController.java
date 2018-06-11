package com.lzr.api.controller;

import com.lzr.api.service.UserService;
import com.lzr.api.vo.User;
import com.lzr.api.vo.response.ResultResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Api(value = "user", description = "用户相关")
@RestController
@RequestMapping("/user")
public class UserController {


//    @Resource(name = "UserServiceImp")
//    private UserService userService;
    @Autowired
    private UserService userService;

    @ApiOperation(value="用户注册", notes="", httpMethod = "GET")
    @RequestMapping("/register")
    public ResultResponse<String> userRegistration() {
        User user = new User();
        user.setUserName("lzr2");
        user.setUserPassword("16899199");
        user.setUserLevel(2);
        ResultResponse<String> result = userService.userRegistration(user);
        return result;
    }
}
