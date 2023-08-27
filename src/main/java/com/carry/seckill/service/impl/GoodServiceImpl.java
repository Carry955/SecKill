package com.carry.seckill.service.impl;

import com.carry.seckill.dao.GoodsMapper;
import com.carry.seckill.entity.Goods;
import com.carry.seckill.service.GoodsService;
import com.carry.seckill.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodServiceImpl implements GoodsService {
    @Autowired
    GoodsMapper goodsMapper;
    @Autowired
    RedisService redisService;
    @Override
    public List<Goods> getGoodsList() {
        return goodsMapper.selectAll();
    }

    @Override
    public Goods getGoodsById(long goodsId) {
        return goodsMapper.selectByPrimaryKey(goodsId);
    }

    @Override
    public int reduceStock(long goodsId) {
        return goodsMapper.;
    }
}
