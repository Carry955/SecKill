package com.carry.seckill.dao;

import com.carry.seckill.entity.SeckillOrder;

public interface SeckillOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SeckillOrder row);

    int insertSelective(SeckillOrder row);

    SeckillOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SeckillOrder row);

    int updateByPrimaryKey(SeckillOrder row);
}