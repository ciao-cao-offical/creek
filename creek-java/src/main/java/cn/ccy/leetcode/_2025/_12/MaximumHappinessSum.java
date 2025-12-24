package cn.ccy.leetcode._2025._12;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/maximize-happiness-of-selected-children/?envType=daily-question&envId=2025-12-25">3075. 幸福值最大化的选择方案</a>
 * @since 2025/12/25 00:21
 */
public class MaximumHappinessSum {
    public static void main(String[] args) {

    }

    public long maximumHappinessSum(int[] happiness, int k) {
        Integer[] arr = Arrays.stream(happiness).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, (a, b) -> b - a);
        long ans = 0;
        for (int i = 0; i < k; i++) {
            ans += Math.max(arr[i] - i, 0);
        }
        return ans;
    }
}
