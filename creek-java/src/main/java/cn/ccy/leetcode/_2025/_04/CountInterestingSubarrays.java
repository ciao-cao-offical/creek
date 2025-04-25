package cn.ccy.leetcode._2025._04;

import java.util.HashMap;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/count-of-interesting-subarrays/?envType=daily-question&envId=2025-04-25">2845. 统计趣味子数组的数目</a>
 * @since 2025/4/25 22:30
 */
public class CountInterestingSubarrays {
    public static void main(String[] args) {

    }

    public long countInterestingSubarrays(List<Integer> nums, int modulo, int k) {
        int n = nums.size();
        HashMap<Integer, Integer> cnt = new HashMap<>();
        long res = 0;
        int prefix = 0;
        cnt.put(0, 1);
        for (int i = 0; i < n; i++) {
            prefix += nums.get(i) % modulo == k ? 1 : 0;
            res += cnt.getOrDefault((prefix - k + modulo) % modulo, 0);
            cnt.put(prefix % modulo, cnt.getOrDefault(prefix % modulo, 0) + 1);
        }
        return res;
    }
}
