package com.ciao.practice;

import com.ciao.practice.impl.PredicateTestApiImpl;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/8/1 18:22
 * @description Predicate测试类
 */
public class PredicateTest {

    @Test
    public void 测试JdkPredicate和GuavaPredicate() {
        Predicate<Integer> predicateFromJdk8 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 10;
            }
        };
        System.out.println(predicateFromJdk8.test(5));
        System.out.println(predicateFromJdk8.test(20));

        com.google.common.base.Predicate<Integer> predicateFromGuava = new com.google.common.base.Predicate<Integer>() {
            @Override
            public boolean apply(Integer input) {
                return input > 10;
            }
        };

        System.out.println(predicateFromGuava.apply(5));
        System.out.println(predicateFromGuava.test(5));
        System.out.println(predicateFromGuava.apply(20));
        System.out.println(predicateFromGuava.test(20));
    }

    @Test
    public void 测试GuavaPredicate() {
        List<Integer> list = Lists.newArrayList(12, 1, 10, 11, 13, 12, 16);

        Collection<Integer> filter = Collections2.filter(list, new com.google.common.base.Predicate<Integer>() {
            @Override
            public boolean apply(Integer input) {
                return input >= 13;
            }
        });

        System.out.println(filter);
    }

    @Test
    public void 测试GuavaPredicate_2() {
        PredicateTestApiImpl api = new PredicateTestApiImpl();
        List<Integer> list = Lists.newArrayList(12, 1, 10, 11, 13, 12, 16);
        List<Integer> filter = api.filter(list);
        System.out.println(filter);
    }
}
