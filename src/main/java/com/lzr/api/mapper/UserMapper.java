package com.lzr.api.mapper;

import com.lzr.api.vo.User;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    /**
     * 保存用户信息
     * @param user
     */
    @Insert("INSERT INTO user_login(user_name,user_password,user_level) VALUES(#{userName}, #{userPassword}, #{userLevel})")
    void insert(User user);

}
