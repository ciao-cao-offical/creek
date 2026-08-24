package cn.ccy.leetcode._2026._08;

import java.util.HashSet;
import java.util.Set;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/smallest-missing-multiple-of-k/?envType=daily-question&envId=2026-08-25">3718. 缺失的最小倍数</a>
 * @since 2026/8/25 01:05
 */
public class MissingMultiple {
    public static void main(String[] args) {

    }

    public int missingMultiple(int[] nums, int k) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            seen.add(num);
        }
        int ans = k;
        while (seen.contains(ans)) {
            ans += k;
        }
        return ans;
    }
}
