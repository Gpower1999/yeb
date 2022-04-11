package com.xxx.server.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;

/**
 * Mybatis分页配置
 *
 * @author Gpower
 * @date 2022/3/29 17:20
 */
public class MybatisPlusConfig {
    @Bean
    public PaginationInterceptor paginationInterceptor(){
        return new PaginationInterceptor();
    }
}
