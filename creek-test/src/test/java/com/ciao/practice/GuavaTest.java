package com.ciao.practice;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import org.junit.Test;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.concurrent.TimeUnit;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/2/9
 * @description Guava测试
 */

public class GuavaTest {

    private static final LoadingCache<String, String> cache = CacheBuilder.newBuilder()
            .refreshAfterWrite(30, TimeUnit.MINUTES)
            .initialCapacity(10)
            .maximumSize(100)
            .build(new CacheLoader<String, String>() {
                @Override
                @Nonnull
                @ParametersAreNonnullByDefault
                //@ElementTypesAreNonnullByDefault
                public String load(String s) {
                    return String.format("guava cache --> %s", s);
                }
            });


    @Test
    public void t1() {
        System.out.println("guava 缓存测试！");
    }
}
