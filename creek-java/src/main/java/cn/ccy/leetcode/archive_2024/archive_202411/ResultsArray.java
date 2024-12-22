package cn.ccy.leetcode.archive_2024.archive_202411;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/11/6 00:17:16
 * @description https://leetcode.cn/problems/find-the-power-of-k-size-subarrays-i/?envType=daily-question&envId=2024-11-06
 */
public class ResultsArray {
    public static void main(String[] args) {

    }

    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        Arrays.fill(ans, -1);
        for (int i = 0; i <= n - k; i++) {
            boolean valid = true;
            for (int j = i + 1; j < i + k; j++) {
                if (nums[j] - nums[j - 1] != 1) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                ans[i] = nums[i + k - 1];
            }
        }
        return ans;
    }
}
