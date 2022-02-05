package com.ciao.practice;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/1/28
 * @description Comparator测试类
 */
public class ComparatorTest {

    @Test
    public void t1() {
        //升序排列
        Integer[] ints_1 = {1, 3, 7, 4, 5, 6, 2};
        Arrays.sort(ints_1, (o1, o2) -> o1 - o2);
        System.out.println(Arrays.toString(ints_1));
        //降序排列
        Integer[] ints_2 = {1, 3, 7, 4, 5, 6, 2};
        Arrays.sort(ints_2, (o1, o2) -> o2 - o1);
        System.out.println(Arrays.toString(ints_2));
    }
}
