package cn.ccy.leetcode._2025._04;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/count-subarrays-with-score-less-than-k/?envType=daily-question&envId=2025-04-28">2302. 统计得分小于 K 的子数组数目</a>
 * @since 2025/4/28 23:08
 * ☆☆☆ 2025cvd
 */
public class CountSubarrayscountSubarrays {
    public static void main(String[] args) {

    }

    public long countSubarrays(int[] nums, long k) {
        int n = nums.length;
        long res = 0, total = 0;
        for (int i = 0, j = 0; j < n; j++) {
            total += nums[j];
            while (i <= j && total * (j - i + 1) >= k) {
                total -= nums[i];
                i++;
            }
            res += j - i + 1;
        }
        return res;
    }
}
