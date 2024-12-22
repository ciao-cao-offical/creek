package cn.ccy.leetcode.archive_2023.archive_202306;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/6/19 0019 22:10:18
 * @description https://leetcode.cn/problems/greatest-sum-divisible-by-three/
 */
public class MaxSumDivThree {
    public static void main(String[] args) {

    }

    public int maxSumDivThree(int[] nums) {
        int[] f = {0, Integer.MIN_VALUE, Integer.MIN_VALUE};
        for (int num : nums) {
            int[] g = Arrays.copyOfRange(f, 0, 3);
            for (int i = 0; i < 3; i++) {
                int remainder = (i + num % 3) % 3;
                g[remainder] = Math.max(g[remainder], f[i] + num);
            }

            f = g;
        }

        return f[0];
    }
}
