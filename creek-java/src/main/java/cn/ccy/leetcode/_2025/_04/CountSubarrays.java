package cn.ccy.leetcode._2025._04;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/count-subarrays-with-fixed-bounds/?envType=daily-question&envId=2025-04-26">2444. 统计定界子数组的数目</a>
 * @since 2025/4/26 22:43
 * ★★★★★ 2025cvd
 */
public class CountSubarrays {
    public static void main(String[] args) {

    }

    public long countSubarrays(int[] nums, int minK, int maxK) {
        long res = 0;
        int border = -1, last_min = -1, last_max = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minK || nums[i] > maxK) {
                last_max = -1;
                last_min = -1;
                border = i;
            }
            if (nums[i] == minK) {
                last_min = i;
            }
            if (nums[i] == maxK) {
                last_max = i;
            }
            if (last_min != -1 && last_max != -1) {
                res += Math.min(last_min, last_max) - border;
            }
        }
        return res;
    }
}
