package cn.ccy.leetcode._2026._11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/maximize-consecutive-elements-in-an-array-after-modification/?envType=daily-question&envId=2026-11-20">3041. 修改数组后最大化数组中的连续元素数目</a>
 * @since 2026/11/20 00:24
 */
public class MaxSelectedElements {
    public static void main(String[] args) {

    }

    public int maxSelectedElements(int[] nums) {
        Arrays.sort(nums);
        Map<Integer, Integer> dp = new HashMap<>();
        int ans = 0;
        for (int x : nums) {
            dp.put(x + 1, Math.max(dp.getOrDefault(x + 1, 0), dp.getOrDefault(x, 0) + 1));
            dp.put(x, Math.max(dp.getOrDefault(x, 0), dp.getOrDefault(x - 1, 0) + 1));
            ans = Math.max(ans, Math.max(dp.get(x), dp.get(x + 1)));
        }
        return ans;
    }
}
