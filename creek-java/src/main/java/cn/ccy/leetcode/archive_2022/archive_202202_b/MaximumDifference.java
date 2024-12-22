package cn.ccy.leetcode.archive_2022.archive_202202_b;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/26
 * @description https://leetcode-cn.com/problems/maximum-difference-between-increasing-elements/
 */
public class MaximumDifference {
    public static void main(String[] args) {
        int[] nums = {7, 1, 5, 4};
        System.out.println(new MaximumDifference().maximumDifference(nums));
    }

    public int maximumDifference(int[] nums) {
        int md = -1;
        for (int i = 0; i < nums.length; i++) {
            int s = nums[i];
            for (int j = i; j < nums.length; j++) {
                int e = nums[j];
                if (e > s) {
                    md = Math.max(md, e - s);
                }
            }
        }

        return md;
    }
}
