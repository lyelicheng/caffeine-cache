package com.llye.cache.caffeinecache.controller;

import com.github.benmanes.caffeine.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private final CacheManager cacheManager;

    public HomeController(CacheManager cacheManager) {
        this.cacheManager = cacheManager;
    }

    @GetMapping("/cache/stats")
    public Object getCacheStats() {
        Cache<Object, Object> cache = (Cache<Object, Object>) cacheManager.getCache("employeesCache").getNativeCache();
        return cache.asMap();
    }
}
