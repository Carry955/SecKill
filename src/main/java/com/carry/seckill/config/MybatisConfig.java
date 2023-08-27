package com.carry.seckill.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.carry.seckill.dao")
public class MybatisConfig {
}
