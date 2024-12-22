package cn.ccy.leetcode.archive_2022.archive_202206;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/6/13
 * @description https://leetcode.cn/problems/height-checker/
 * cvd 紧急需求上线，摆烂ing...
 */
public class HeightChecker {
    public static void main(String[] args) {

    }

    public int heightChecker(int[] heights) {
        int n = heights.length, ans = 0;
        int[] expected = new int[n];
        System.arraycopy(heights, 0, expected, 0, n);
        Arrays.sort(expected);
        for (int i = 0; i < n; ++i) {
            if (heights[i] != expected[i]) {
                ++ans;
            }
        }
        return ans;
    }
}
