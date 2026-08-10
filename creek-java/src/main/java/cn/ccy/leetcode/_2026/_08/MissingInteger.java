package cn.ccy.leetcode._2026._08;

import java.util.HashSet;
import java.util.Set;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/smallest-missing-integer-greater-than-sequential-prefix-sum/?envType=daily-question&envId=2026-08-11">2996. 大于等于顺序前缀和的最小缺失整数</a>
 * @since 2026/8/11 00:22
 */
public class MissingInteger {
    public static void main(String[] args) {

    }

    public int missingInteger(int[] nums) {
        int n = nums.length;
        Set<Integer> numSet = new HashSet<>(n);
        for (int num : nums) {
            numSet.add(num);
        }
        int total = nums[0];

        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                total += nums[i];
            } else {
                break;
            }
        }

        while (numSet.contains(total)) {
            total += 1;
        }

        return total;
    }
}
