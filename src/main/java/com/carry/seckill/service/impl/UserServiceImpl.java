package com.carry.seckill.service.impl;

import com.carry.seckill.common.CodeMsg;
import com.carry.seckill.common.Result;
import com.carry.seckill.component.LoginParam;
import com.carry.seckill.dao.UserMapper;
import com.carry.seckill.entity.User;
import com.carry.seckill.service.UserService;
import com.carry.seckill.utils.MD5Util;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public Result<User> login(LoginParam loginParam) {
        User user = userMapper.checkPhone(loginParam.getMobile());
        if (user == null) {
            return Result.error(CodeMsg.MOBILE_NOT_EXIST);
        }
        String dbPwd = user.getPassword();
        String saltDB = user.getSalt();
        String calcPass = MD5Util.formPassToDBPass(loginParam.getPassword(), saltDB);
        if (!StringUtils.equals(dbPwd, calcPass)) {
            return Result.error(CodeMsg.PASSWORD_ERROR);
        }
        user.setPassword(StringUtils.EMPTY);
        return Result.success(user);
    }

    @Override
    public Result<User> logout(LoginParam loginParam) {
        return null;
    }
}
