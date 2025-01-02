package cn.ccy.leetcode._2023.archive_202307;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/7/8 0008 21:49:33
 * @description https://leetcode.cn/problems/two-sum-ii-input-array-is-sorted/
 */
public class TwoSum2 {
    public static void main(String[] args) {

    }

    // 双指针 压缩空间
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            } else {
                return new int[]{left + 1, right + 1};
            }
        }

        return null;
    }

    // 双指针
    /*public int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;
        for (int left = 0; left < len - 1; left++) {
            for (int right = len - 1; right > left; right--) {
                if (numbers[left] + numbers[right] == target) {
                    return new int[]{left + 1, right + 1};
                }
            }
        }
        return null;
    }*/
}
