package com.carry.seckill.dao;

import com.carry.seckill.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User row);

    int insertSelective(User row);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User row);

    int updateByPrimaryKey(User row);

    User selectByPhoneAndPasswordUser(@Param("phone") String phone, @Param("password") String password);
    User checkPhone(@Param("phone") String phone);
}