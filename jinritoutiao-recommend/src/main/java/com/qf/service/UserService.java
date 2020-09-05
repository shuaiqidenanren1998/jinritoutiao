package com.qf.service;

import com.qf.pojo.User;

public interface UserService {

    public User login(String name, String password);
    public User register(String name, String password);

}
