package cn.ccy.leetcode._2025._04;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/count-subarrays-of-length-three-with-a-condition/?envType=daily-question&envId=2025-04-27">3392. 统计符合条件长度为 3 的子数组数目</a>
 * @since 2025/4/27 23:18
 */
public class CountSubarrays2 {
    public static void main(String[] args) {

    }

    public int countSubarrays(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for (int i = 1; i < n - 1; ++i) {
            if (nums[i] == (nums[i - 1] + nums[i + 1]) * 2) {
                ++ans;
            }
        }
        return ans;
    }
}
