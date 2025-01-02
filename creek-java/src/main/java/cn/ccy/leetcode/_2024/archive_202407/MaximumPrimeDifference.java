package cn.ccy.leetcode._2024.archive_202407;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/7/2 22:28:13
 * @description https://leetcode.cn/problems/maximum-prime-difference/?envType=daily-question&envId=2024-07-02
 */
public class MaximumPrimeDifference {
    public static void main(String[] args) {
        System.out.println(new MaximumPrimeDifference().maximumPrimeDifference(new int[]{4, 2, 9, 5, 3}));
    }

    public int maximumPrimeDifference(int[] nums) {
        int maxDistance = 0;
        int left = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 1 && isPrimaryNumber(nums[i])) {
                if (left == -1) {
                    left = i;
                } else {
                    maxDistance = i - left;
                }
            }
        }

        return maxDistance;
    }

    private boolean isPrimaryNumber(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
