package cn.ccy.leetcode._2025._06;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/longest-harmonious-subsequence/?envType=daily-question&envId=2025-06-30">594. 最长和谐子序列</a>
 * @since 2025/6/30 22:15
 */
public class FindLHS {
    public static void main(String[] args) {

    }

    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int begin = 0;
        int res = 0;
        for (int end = 0; end < nums.length; end++) {
            while (nums[end] - nums[begin] > 1) {
                begin++;
            }
            if (nums[end] - nums[begin] == 1) {
                res = Math.max(res, end - begin + 1);
            }
        }
        return res;
    }
}
