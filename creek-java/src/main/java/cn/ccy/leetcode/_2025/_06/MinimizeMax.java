package cn.ccy.leetcode._2025._06;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/minimize-the-maximum-difference-of-pairs/?envType=daily-question&envId=2025-06-13">2616. 最小化数对的最大差值</a>
 * @since 2025/6/13 21:32
 */
public class MinimizeMax {
    public static void main(String[] args) {

    }

    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int left = 0, right = nums[nums.length - 1] - nums[0];

        while (left < right) {
            int mid = (left + right) / 2;
            int count = 0;
            for (int i = 0; i < nums.length - 1; ) {
                if (nums[i + 1] - nums[i] <= mid) {
                    count++;
                    i += 2;
                } else {
                    i++;
                }
            }
            if (count >= p) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}
