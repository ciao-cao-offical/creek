package cn.ccy.leetcode._2025._04;

import java.util.HashMap;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/count-number-of-bad-pairs/?envType=daily-question&envId=2025-04-18">2364. 统计坏数对的数目</a>
 * @since 2025/4/18 23:26
 */
public class CountBadPairs {
    public static void main(String[] args) {

    }

    public long countBadPairs(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        long res = 0;
        for (int i = 0; i < nums.length; i++) {
            int key = nums[i] - i;
            res += i - mp.getOrDefault(key, 0);
            mp.put(key, mp.getOrDefault(key, 0) + 1);
        }
        return res;
    }
}
