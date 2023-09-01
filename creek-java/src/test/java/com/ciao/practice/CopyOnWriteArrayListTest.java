package com.ciao.practice;

import lombok.extern.log4j.Log4j2;
import org.junit.Test;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/9/1 16:47
 * @description CopyOnWriteArrayList测试类
 */
@Log4j2
public class CopyOnWriteArrayListTest {
    @Test
    public void 测试多线程修改() {
        String key = "1";
        List<Integer> list = new CopyOnWriteArrayList<>(new Integer[]{1, 2, 3, 4, 5, 6, 7});
//        List<Integer> list = Lists.newArrayList(1, 2, 3, 4, 5, 6, 7);
        list.add(8);

        // 创建线程，向集合中添加数据
        new Thread(() -> {
            for (int i = 9; i < 100; i++) {
                list.add(i);

                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

        // 对集合进行逆向排序
        for (int i = 0; i < 10000; i++) {
            list.sort(Comparator.reverseOrder());
            log.info("list - {}", list);
        }
    }
}
