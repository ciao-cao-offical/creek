package com.ciao.leetcode.archive_202304;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/4/13 0013 22:35:42
 * @description https://leetcode.cn/problems/most-frequent-even-element/
 */
public class MostFrequentEven {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 4, 4, 1};
        System.out.println(new MostFrequentEven().mostFrequentEven(nums));
    }

    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> counter = new HashMap<>();
        for (int num : nums) {
            if (num % 2 == 0) {
                counter.put(num, counter.getOrDefault(num, 0) + 1);
            }
        }

        int key = -1;
        int value = 0;
        for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            Integer k = entry.getKey();
            Integer v = entry.getValue();
            if (v > value) {
                key = k;
                value = v;
            } else if (v == value && key > k) {
                key = k;
            }
        }

        return key;
    }
}
