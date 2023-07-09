package com.ciao.practice;

import java.util.Random;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/7/9 0009 11:05:14
 * @description Random测试
 */
public class RandomTest {
    public static void main(String[] args) {
        Random rng = new Random();

        RandomTestClazz c_1 = new RandomTestClazz();
        Random rng_1 = c_1.getRng();
        int i_1 = rng_1.nextInt(5);

        RandomTestClazz c_2 = new RandomTestClazz();
        Random rng_2 = c_2.getRng();
        int i_2 = rng_2.nextInt(5);

        System.out.println("random test");
    }


}

class RandomTestClazz {
    private final Random rng = new Random(2);

    public Random getRng() {
        return rng;
    }
}
