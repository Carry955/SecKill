package com.carry.seckill.dao;

import com.carry.seckill.entity.OrdeInfo;

public interface OrdeInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrdeInfo row);

    int insertSelective(OrdeInfo row);

    OrdeInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrdeInfo row);

    int updateByPrimaryKey(OrdeInfo row);
}