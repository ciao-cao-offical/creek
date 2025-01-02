package cn.ccy.leetcode._2024.archive_202407;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/7/11 22:34:48
 * @description https://leetcode.cn/problems/count-the-number-of-incremovable-subarrays-ii/?envType=daily-question&envId=2024-07-11
 * ☆☆☆☆☆ 2024cvd
 */
public class IncremovableSubarrayCount2 {
    public static void main(String[] args) {

    }

    public long incremovableSubarrayCount(int[] nums) {
        long ans = 0;
        int len = nums.length;
        int l = 0;
        while (l < len - 1) {
            if (nums[l] >= nums[l + 1]) {
                break;
            }
            l++;
        }
        if (l == len - 1) {
            return 1L * len * (len + 1) / 2;
        }

        ans += l + 2;
        for (int r = len - 1; r > 0; r--) {
            if (r < len - 1 && nums[r] >= nums[r + 1]) {
                break;
            }

            while (l >= 0 && nums[l] >= nums[r]) {
                l--;
            }
            ans += l + 2;
        }

        return ans;
    }
}
