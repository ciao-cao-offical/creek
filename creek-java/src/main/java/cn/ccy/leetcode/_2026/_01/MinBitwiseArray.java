package cn.ccy.leetcode._2026._01;

import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/construct-the-minimum-bitwise-array-i/?envType=daily-question&envId=2026-01-20">3314. 构造最小位运算数组 I</a>
 * @since 2026/1/20 01:07
 */
public class MinBitwiseArray {
    public static void main(String[] args) {

    }

    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int x = nums.get(i);
            int res = -1;
            int d = 1;
            while ((x & d) != 0) {
                res = x - d;
                d <<= 1;
            }
            result[i] = res;
        }
        return result;
    }
}
