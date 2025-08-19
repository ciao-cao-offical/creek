package cn.ccy.leetcode._2025._08;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/number-of-zero-filled-subarrays/?envType=daily-question&envId=2025-08-19">2348. 全 0 子数组的数目</a>
 * @since 2025/8/19 23:47
 */
public class ZeroFilledSubarray {
    public static void main(String[] args) {

    }

    public long zeroFilledSubarray(int[] nums) {
        long ans = 0;
        int last = -1;
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (x != 0) {
                last = i; // 记录上一个非 0 元素的位置
            } else {
                ans += i - last;
            }
        }
        return ans;
    }
}
