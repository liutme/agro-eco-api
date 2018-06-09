package com.lzr.api.service;

import com.lzr.api.vo.User;
import com.lzr.api.vo.response.ResultResponse;

public interface UserService {

    ResultResponse<String> userRegistration(User user);

}
