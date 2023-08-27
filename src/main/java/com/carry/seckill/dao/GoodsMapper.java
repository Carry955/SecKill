package com.carry.seckill.dao;

import com.carry.seckill.entity.Goods;

import java.util.List;

public interface GoodsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Goods row);

    int insertSelective(Goods row);

    Goods selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Goods row);

    int updateByPrimaryKeyWithBLOBs(Goods row);

    int updateByPrimaryKey(Goods row);

    List<Goods> selectAll();
}