package cn.ccy.leetcode._2026._01;

import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/construct-the-minimum-bitwise-array-ii/?envType=daily-question&envId=2026-01-21">3315. 构造最小位运算数组 II</a>
 * @since 2026/1/21 01:14
 */
public class MinBitwiseArray2 {
    public static void main(String[] args) {

    }

    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int x = nums.get(i);
            if (x == 2) {
                ans[i] = -1;
            } else {
                int t = ~x;
                int lowbit = t & -t;
                ans[i] = x ^ (lowbit >> 1);
            }
        }
        return ans;
    }
}
