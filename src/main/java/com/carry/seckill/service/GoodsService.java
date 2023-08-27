package com.carry.seckill.service;

import com.carry.seckill.entity.Goods;

import java.util.List;

public interface GoodsService {
    List<Goods> getGoodsList();
    Goods getGoodsById(long goodsId);
    int reduceStock(long goodsId);
}
