package cn.ccy.leetcode.archive_202407;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/7/12 19:52:20
 * @description https://leetcode.cn/problems/minimum-number-game/?envType=daily-question&envId=2024-07-12
 */
public class NumberGame {
    public static void main(String[] args) {

    }

    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 2) {
            int tmp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = tmp;
        }
        return nums;
    }
}
