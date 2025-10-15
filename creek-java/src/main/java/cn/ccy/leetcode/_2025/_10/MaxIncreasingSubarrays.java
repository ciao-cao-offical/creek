package cn.ccy.leetcode._2025._10;

import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/adjacent-increasing-subarrays-detection-ii/?envType=daily-question&envId=2025-10-15">3350. 检测相邻递增子数组 II</a>
 * @since 2025/10/15 22:55
 */
public class MaxIncreasingSubarrays {
    public static void main(String[] args) {

    }

    public int maxIncreasingSubarrays(List<Integer> nums) {
        int ans = 0;
        int n = nums.size();
        for (int i = 0, pre = 0, cur, j; i < n; i++) {
            j = i;
            while (i + 1 < n && nums.get(i + 1) > nums.get(i)) {
                i++;
            }
            cur = i - j + 1;
            ans = Math.max(ans, Math.max(Math.min(pre, cur), cur / 2));
            pre = cur;
        }
        return ans;
    }
}
