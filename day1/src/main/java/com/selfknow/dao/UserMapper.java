package com.selfknow.dao;

import com.selfknow.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface UserMapper {
    List<User> getUserList();
}
