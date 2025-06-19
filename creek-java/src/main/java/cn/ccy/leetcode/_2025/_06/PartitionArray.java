package cn.ccy.leetcode._2025._06;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/partition-array-such-that-maximum-difference-is-k/?envType=daily-question&envId=2025-06-19">2294. 划分数组使最大差为 K</a>
 * @since 2025/6/19 23:53
 */
public class PartitionArray {
    public static void main(String[] args) {

    }

    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = 1;
        int rec = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] - rec > k) {
                ans++;
                rec = nums[i];
            }
        }
        return ans;
    }
}
