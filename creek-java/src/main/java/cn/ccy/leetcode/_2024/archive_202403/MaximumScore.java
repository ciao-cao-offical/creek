package cn.ccy.leetcode._2024.archive_202403;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/3/19 0019 00:04:32
 * @description https://leetcode.cn/problems/maximum-score-of-a-good-subarray/?envType=daily-question&envId=2024-03-19
 * ★★★★★ 2024cvd
 */
public class MaximumScore {
    public static void main(String[] args) {

    }

    public int maximumScore(int[] nums, int k) {
        int n = nums.length;
        int left = k - 1, right = k + 1;
        int ans = 0;
        for (int i = nums[k]; ; --i) {
            while (left >= 0 && nums[left] >= i) {
                --left;
            }
            while (right < n && nums[right] >= i) {
                ++right;
            }
            ans = Math.max(ans, (right - left - 1) * i);
            if (left == -1 && right == n) {
                break;
            }
        }
        return ans;
    }
}
