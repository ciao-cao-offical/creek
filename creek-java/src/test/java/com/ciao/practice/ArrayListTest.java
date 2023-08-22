package com.ciao.practice;

import lombok.extern.log4j.Log4j2;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2021/11/30
 * @description ArrayList测试类
 */
@Log4j2
public class ArrayListTest {
    @Test
    public void 测试元素数量() {
        List<String> list = new ArrayList<>();
        System.out.println(list.size());
        list.add(null);
        System.out.println(list.size());
        System.out.println(list.get(0));
        list.add("1");
        System.out.println(list.get(1));
    }

    @Test
    public void 测试遍历过程中异常捕获() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        for (Integer i : list) {
            try {
                if (i == 1) {
                    throw new RuntimeException("异常，异常，异常");
                }
            } catch (RuntimeException e) {
                log.error("出现异常，异常堆栈：", e);
                continue;
            }

            log.info("===> {}", i);
        }
    }
}
