package cn.ccy.leetcode._2025._09;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/valid-triangle-number/?envType=daily-question&envId=2025-09-26">611. 有效三角形的个数</a>
 * @since 2025/9/26 21:14
 */
public class TriangleNumber {
    public static void main(String[] args) {

    }

    public int triangleNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int ans = 0;
        for (int i = 0; i < n; ++i) {
            int k = i;
            for (int j = i + 1; j < n; ++j) {
                while (k + 1 < n && nums[k + 1] < nums[i] + nums[j]) {
                    ++k;
                }
                ans += Math.max(k - j, 0);
            }
        }
        return ans;
    }
}
