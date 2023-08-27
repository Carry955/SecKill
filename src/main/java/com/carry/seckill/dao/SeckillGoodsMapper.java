package com.carry.seckill.dao;

import com.carry.seckill.entity.SeckillGoods;

public interface SeckillGoodsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SeckillGoods row);

    int insertSelective(SeckillGoods row);

    SeckillGoods selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SeckillGoods row);

    int updateByPrimaryKey(SeckillGoods row);
}