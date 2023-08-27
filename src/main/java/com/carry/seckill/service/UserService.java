package com.carry.seckill.service;

import com.carry.seckill.common.Result;
import com.carry.seckill.component.LoginParam;
import com.carry.seckill.entity.User;

public interface UserService {
    Result<User> login(LoginParam loginParam);
    Result<User> logout(LoginParam loginParam);
}
