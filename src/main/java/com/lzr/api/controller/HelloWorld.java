package com.lzr.api.controller;

import com.lzr.api.vo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping(value = "/helloWorld", method = RequestMethod.GET)
    public User helloWorld () {
        User user = new User();
        user.setName("lzr");
        user.setAge(18);
        user.setPhone("13511112222");
        user.setSex(1);
        return user;
    }
}
