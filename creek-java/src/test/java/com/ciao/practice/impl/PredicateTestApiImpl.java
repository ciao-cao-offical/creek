package com.ciao.practice.impl;

import com.ciao.practice.PredicateTestApi;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/8/1 18:37
 * @description Predicate测试接口服务实现类
 */
public class PredicateTestApiImpl implements PredicateTestApi {
    @Override
    public List<Integer> filter(List<Integer> list) {
        Collection<Integer> filter = Collections2.filter(list, new Predicate<Integer>() {
            @Override
            public boolean apply(@Nullable Integer input) {
                return input > 10;
            }
        });
        List<Integer> res = new ArrayList<>(filter);
        return res;
    }
}
