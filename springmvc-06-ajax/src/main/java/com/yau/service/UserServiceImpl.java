package com.yau.service;

import com.yau.mapper.UserMapper;
import com.yau.pojo.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User findUserByName(String username) {
        return userMapper.findUserByUsername(username);
    }
}
