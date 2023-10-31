package com.yunusbagriyanik.springrediscache.config;

import org.springframework.boot.autoconfigure.cache.RedisCacheManagerBuilderCustomizer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;

import java.time.Duration;

@Configuration
@EnableCaching
public class RedisConfiguration {

    @Bean
    public RedisCacheManagerBuilderCustomizer redisCacheManagerBuilderCustomizer() {
        return (builder) -> builder
                .withCacheConfiguration("GET_USERS_API_CACHE",
                        RedisCacheConfiguration
                                .defaultCacheConfig()
                                .disableKeyPrefix()
                                .entryTtl(Duration.ofMinutes(1)));
    }
}