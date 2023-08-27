package com.carry.seckill.service;

import com.sun.org.apache.xpath.internal.operations.Bool;

public interface RedisService {
    void set(String key, Object value, long time);
    void set(String key, Object value);
    Object get(String key);
    void expire(String key, long time);
    Boolean del(String key);
    Boolean exists(String key);
    Long incr(String key, long delta);
    Long incr(String key);
    Long decr(String key, long delta);
    Long decr(String key);
}
