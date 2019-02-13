package com.lmt.shiro_demo2.service;


import com.lmt.shiro_demo2.model.User;

public interface UserService {

    User findByUsername(String username);
}
