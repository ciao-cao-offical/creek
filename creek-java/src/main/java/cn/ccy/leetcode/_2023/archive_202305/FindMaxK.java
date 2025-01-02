package cn.ccy.leetcode._2023.archive_202305;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/5/13 0013 22:36:07
 * @description https://leetcode.cn/problems/largest-positive-integer-that-exists-with-its-negative/
 */
public class FindMaxK {
    public static void main(String[] args) {
        int[] nums = {-1, 2, -3, 3};
        System.out.println(new FindMaxK().findMaxK(nums));
    }

    //双指针
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0, j = nums.length - 1; j >= 0; j--) {
            while (i < j && nums[i] < -nums[j]) {
                i++;
            }

            if (nums[i] == -nums[j]) {
                return nums[j];
            }
        }
        return -1;
    }

    /* //哈希表
    public int findMaxK(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max = -1;
        for (int num : nums) {
            if (set.contains(num)) {
                continue;

            } else if (set.contains(-num)) {
                max = Math.max(max, Math.abs(num));
            }
            set.add(num);
        }

        return max;
    }*/
}
