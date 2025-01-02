package cn.ccy.leetcode._2024.archive_202409;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/9/11 00:29:07
 * @description https://leetcode.cn/problems/maximize-win-from-two-segments/?envType=daily-question&envId=2024-09-11
 */
public class MaximizeWin {
    public static void main(String[] args) {

    }

    public int maximizeWin(int[] prizePositions, int k) {
        int n = prizePositions.length;
        int[] dp = new int[n + 1];
        int ans = 0;
        for (int left = 0, right = 0; right < n; right++) {
            while (prizePositions[right] - prizePositions[left] > k) {
                left++;
            }
            ans = Math.max(ans, right - left + 1 + dp[left]);
            dp[right + 1] = Math.max(dp[right], right - left + 1);
        }
        return ans;
    }
}
