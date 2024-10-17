package cn.ccy.leetcode.archive_202410;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/10/18 00:26:16
 * @description https://leetcode.cn/problems/minimum-operations-to-make-binary-array-elements-equal-to-one-i/?envType=daily-question&envId=2024-10-18
 */
public class MinOperations {
    public static void main(String[] args) {

    }

    public int minOperations(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                if (i > n - 3) {
                    return -1;
                }
                nums[i] ^= 1;
                nums[i + 1] ^= 1;
                nums[i + 2] ^= 1;
                ans++;
            }
        }

        return ans;
    }
}
