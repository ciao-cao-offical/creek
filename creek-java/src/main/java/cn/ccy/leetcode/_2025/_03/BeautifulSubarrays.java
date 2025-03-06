package cn.ccy.leetcode._2025._03;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2025/3/6 22:59
 * @description/link https://leetcode.cn/problems/count-the-number-of-beautiful-subarrays/?envType=daily-question&envId=2025-03-06
 */
public class BeautifulSubarrays {
    public static void main(String[] args) {

    }

    public long beautifulSubarrays(int[] nums) {
        Map<Integer, Integer> cnt = new HashMap<>();
        int mask = 0;
        long ans = 0;
        cnt.put(0, 1);
        for (int x : nums) {
            mask ^= x;
            ans += cnt.getOrDefault(mask, 0);
            cnt.put(mask, cnt.getOrDefault(mask, 0) + 1);
        }
        return ans;
    }
}
