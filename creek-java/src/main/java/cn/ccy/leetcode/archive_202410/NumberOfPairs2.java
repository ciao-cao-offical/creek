package cn.ccy.leetcode.archive_202410;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/10/11 00:00:56
 * @description https://leetcode.cn/problems/find-the-number-of-good-pairs-ii/?envType=daily-question&envId=2024-10-11
 */
public class NumberOfPairs2 {
    public static void main(String[] args) {

    }

    public long numberOfPairs(int[] nums1, int[] nums2, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        Map<Integer, Integer> count2 = new HashMap<>();
        int max1 = 0;
        for (int num : nums1) {
            count.put(num, count.getOrDefault(num, 0) + 1);
            max1 = Math.max(max1, num);
        }
        for (int num : nums2) {
            count2.put(num, count2.getOrDefault(num, 0) + 1);
        }
        long res = 0;
        for (int a : count2.keySet()) {
            for (int b = a * k; b <= max1; b += a * k) {
                if (count.containsKey(b)) {
                    res += 1L * count.get(b) * count2.get(a);
                }
            }
        }
        return res;
    }
}
