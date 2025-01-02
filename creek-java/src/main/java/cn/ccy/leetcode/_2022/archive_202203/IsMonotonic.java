package cn.ccy.leetcode._2022.archive_202203;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/3
 * @description https://leetcode-cn.com/problems/monotonic-array/
 */
public class IsMonotonic {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3};
        System.out.println(new IsMonotonic().isMonotonic(nums));
    }

    public boolean isMonotonic(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return true;
        }
        boolean inc = true;
        boolean dec = true;
        for (int i = 0; i < len - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                dec = false;

            } else if (nums[i] > nums[i + 1]) {
                inc = false;
            }
        }
        return inc || dec;
    }
}
