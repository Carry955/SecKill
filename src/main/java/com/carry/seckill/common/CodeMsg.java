package com.carry.seckill.common;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
public enum CodeMsg {
    SUCCESS(0, "success"),
    SERVER_ERROR(500100, "服务端异常"),
    BIND_ERROR(500101, "参数校验异常"),
    REQUEST_ILLEGAL(500102, "请求非法"),
    ACCESS_LIMIT_REACHED(500104, "访问太频繁"),
    SESSION_ERROR(500210, "Session不存在或者已经失效"),
    PASSWORD_EMPTY(500211, "登录密码不能为空"),
    MOBILE_EMPTY(500212, "手机号不能为空"),
    MOBILE_ERROR(500213, "手机号格式错误"),
    MOBILE_NOT_EXIST(500214, "手机号不存在"),
    PASSWORD_ERROR(500215, "密码错误"),
    USER_NO_LOGIN(500216, "用户未登录"),
    NO_GOODS(500300, "没有该商品"),
    ORDER_NOT_EXISTS(500400, "订单不存在"),
    MIAO_SHA_OVER(500500, "商品已经秒杀完毕"),
    REPEATE_MIAOSHA(500501, "不能重复秒杀");

    private int code;
    private String msg;
    private CodeMsg() {}
    private CodeMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
