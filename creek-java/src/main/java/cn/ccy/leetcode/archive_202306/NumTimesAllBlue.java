package cn.ccy.leetcode.archive_202306;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/6/14 0014 22:21:28
 * @description https://leetcode.cn/problems/number-of-times-binary-string-is-prefix-aligned/
 */
public class NumTimesAllBlue {
    public static void main(String[] args) {
        int[] flips = {4, 1, 2, 3};
        System.out.println(new NumTimesAllBlue().numTimesAllBlue(flips));
    }

    public int numTimesAllBlue(int[] flips) {
        int n = flips.length;
        int ans = 0, right = 0;
        for (int i = 0; i < n; ++i) {
            right = Math.max(right, flips[i]);
            if (right == i + 1) {
                ++ans;
            }
        }
        return ans;
    }
}
