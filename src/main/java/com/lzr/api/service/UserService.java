package com.lzr.api.service;

import com.lzr.api.mapper.UserMapper;
import com.lzr.api.vo.User;
import com.lzr.api.vo.response.ResultResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);
    @Autowired
    private UserMapper userMapper;

    public ResultResponse<String> userRegistration(User user){
        ResultResponse<String> result;
        try {
            userMapper.insert(user);
            result = new ResultResponse<>(1, "注册成功");
        } catch (Exception e) {
            result = new ResultResponse<>(0, "注册失败");
            logger.error(e.getMessage(),e);
        }
        return result;
    }
}
