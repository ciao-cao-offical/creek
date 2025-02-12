package cn.ccy.leetcode._2025._02;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2025/2/12 22:30
 * @description/link https://leetcode.cn/problems/minimum-limit-of-balls-in-a-bag/?envType=daily-question&envId=2025-02-12
 */
public class MinimumSize {
    public static void main(String[] args) {

    }

    public int minimumSize(int[] nums, int maxOperations) {
        int left = 1, right = Arrays.stream(nums).max().getAsInt();
        int ans = 0;
        while (left <= right) {
            int y = (left + right) / 2;
            long ops = 0;
            for (int x : nums) {
                ops += (x - 1) / y;
            }
            if (ops <= maxOperations) {
                ans = y;
                right = y - 1;
            } else {
                left = y + 1;
            }
        }
        return ans;
    }
}
