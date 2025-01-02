package cn.ccy.leetcode._2022.archive_202204;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/2 0002
 * @description https://leetcode-cn.com/problems/longest-increasing-subsequence/
 */
public class LengthOfLIS {
    public static void main(String[] args) {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(new LengthOfLIS().lengthOfLIS(nums));
    }

    //贪心+二分查找
    public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return 1;
        }
        int maxLen = 1;
        int[] d = new int[len + 1];
        d[maxLen] = nums[0];
        for (int i = 1; i < len; i++) {
            if (nums[i] > d[maxLen]) {
                d[++maxLen] = nums[i];

            } else if (nums[i] == d[maxLen]) {
                continue;
            }

            int left = 1;
            int right = maxLen;
            int pos = 0;
            while (left <= right) {
                int mid = (left + right) >> 1;
                if (d[mid] < nums[i]) {
                    pos = mid;
                    left = mid + 1;

                } else {
                    right = mid - 1;
                }
            }
            d[pos + 1] = nums[i];
        }
        return maxLen;
    }

    //动态规划
    /*public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return 1;
        }
        int maxLen = -1;
        int[] dp = new int[len];
        dp[0] = 1;
        for (int i = 0; i < len; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLen = Math.max(dp[i], maxLen);
        }

        return maxLen;
    }*/
}
