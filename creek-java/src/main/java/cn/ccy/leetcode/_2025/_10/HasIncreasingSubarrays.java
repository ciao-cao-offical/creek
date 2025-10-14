package cn.ccy.leetcode._2025._10;

import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/adjacent-increasing-subarrays-detection-i/?envType=daily-question&envId=2025-10-14">3349. 检测相邻递增子数组 I</a>
 * @since 2025/10/14 23:13
 */
public class HasIncreasingSubarrays {
    public static void main(String[] args) {

    }

    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();
        for (int i = 0, j, pre = 0, cur; i < n; i++) {
            j = i;
            while (i + 1 < n && nums.get(i + 1) > nums.get(i)) {
                i++;
            }
            // 连续严格递增 j~i
            cur = i - j + 1;
            // 两种可能性:一个序列>=2k || 前后两个序列均>=k
            if (cur >= k * 2 || (pre >= k && cur >= k)) {
                return true;
            }
            pre = cur;
        }
        return false;
    }
}
