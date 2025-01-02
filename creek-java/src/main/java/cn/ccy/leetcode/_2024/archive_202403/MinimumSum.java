package cn.ccy.leetcode._2024.archive_202403;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/3/29 0029 00:04:43
 * @description https://leetcode.cn/problems/minimum-sum-of-mountain-triplets-i/?envType=daily-question&envId=2024-03-29
 */
public class MinimumSum {
    public static void main(String[] args) {

    }

    public int minimumSum(int[] nums) {
        int n = nums.length, res = 1000;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] < nums[j] && nums[k] < nums[j]) {
                        res = Math.min(res, nums[i] + nums[j] + nums[k]);
                    }
                }
            }
        }
        return res < 1000 ? res : -1;
    }
}
