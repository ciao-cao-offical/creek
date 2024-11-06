package cn.ccy.leetcode.archive_202411;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/11/7 00:03:49
 * @description https://leetcode.cn/problems/find-the-power-of-k-size-subarrays-ii/?envType=daily-question&envId=2024-11-07
 */
public class ResultsArray2 {
    public static void main(String[] args) {

    }

    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        Arrays.fill(ans, -1);
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            cnt = i == 0 || nums[i] - nums[i - 1] != 1 ? 1 : cnt + 1;
            if (cnt >= k) {
                ans[i - k + 1] = nums[i];
            }
        }
        return ans;
    }

}
