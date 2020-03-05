package com.yau.service;

import com.yau.pojo.User;

public interface UserService {
    User findUserByName(String username);
}
