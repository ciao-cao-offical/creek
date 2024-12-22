package cn.ccy.leetcode.archive_2023.archive_202310;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/10/19 22:56
 * @description https://leetcode.cn/problems/tuple-with-same-product/description/?envType=daily-question&envId=2023-10-19
 */
public class TupleSameProduct {
    public static void main(String[] args) {

    }

    public int tupleSameProduct(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> cnt = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int key = nums[i] * nums[j];
                cnt.put(key, cnt.getOrDefault(key, 0) + 1);
            }
        }
        int ans = 0;
        for (Integer v : cnt.values()) {
            ans += v * (v - 1) * 4;
        }
        return ans;
    }
}
