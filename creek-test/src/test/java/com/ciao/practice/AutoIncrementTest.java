package com.ciao.practice;

import org.junit.Test;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/11
 * @description 自增测试类
 */
public class AutoIncrementTest {

    @Test
    public void 数组自增取用测试() {
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8};
        int i1 = 2;
        System.out.println(ints[i1++]);
        int i2 = 2;
        System.out.println(ints[++i2]);
    }

}
