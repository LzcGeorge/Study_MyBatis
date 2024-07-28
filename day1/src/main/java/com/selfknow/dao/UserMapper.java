package com.selfknow.dao;

import com.selfknow.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    List<User> getUserList();
    User selectByUP(@Param("username") String username, @Param("password") String pwd);
    User selectByUser(User form);
    User selectByUsername(String username);
}
