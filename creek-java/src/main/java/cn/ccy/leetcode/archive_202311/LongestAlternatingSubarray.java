package cn.ccy.leetcode.archive_202311;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/11/16 0016 00:48:21
 * @description https://leetcode.cn/problems/longest-even-odd-subarray-with-threshold/?envType=daily-question&envId=2023-11-16
 */
public class LongestAlternatingSubarray {
    public static void main(String[] args) {

    }

    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int res = 0, n = nums.length;
        for (int l = 0; l < n; l++) {
            for (int r = l; r < n; r++) {
                if (isSatisfied(nums, l, r, threshold)) {
                    res = Math.max(res, r - l + 1);
                }
            }
        }
        return res;
    }

    public boolean isSatisfied(int[] nums, int l, int r, int threshold) {
        if (nums[l] % 2 != 0) {
            return false;
        }
        for (int i = l; i <= r; i++) {
            if (nums[i] > threshold || (i < r && nums[i] % 2 == nums[i + 1] % 2)) {
                return false;
            }
        }
        return true;
    }
}
