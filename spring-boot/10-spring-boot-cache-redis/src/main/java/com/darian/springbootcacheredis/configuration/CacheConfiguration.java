package com.darian.springbootcacheredis.configuration;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


@Configuration
@EnableCaching
public class CacheConfiguration {

    @Bean
    public CacheManager simpleCacheManager(){
        SimpleCacheManager simpleCacheManager = new SimpleCacheManager();
        ConcurrentMapCache cache = new ConcurrentMapCache("cache-1");
        ConcurrentMapCache personCache = new ConcurrentMapCache("persons");
        simpleCacheManager.setCaches(Arrays.asList(cache, personCache));
        return simpleCacheManager;
    }
}
