package com.carry.seckill.controller;

import com.carry.seckill.entity.Goods;
import com.carry.seckill.service.GoodsService;
import com.carry.seckill.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    RedisService redisService;
    @Autowired
    GoodsService goodsService;

    @RequestMapping("/list")
    @ResponseBody
    public List<Goods> list() {
        List<Goods> goods = goodsService.getGoodsList();
        return goods;
    }

    @RequestMapping("/to_detail2/{goodsId}")
    @ResponseBody
    public Goods detail(@PathVariable("goodsId") long goodsId) {
        Goods good = goodsService.getGoodsById(goodsId);
        return good;
    }
}
