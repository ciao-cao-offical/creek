package cn.ccy.leetcode.archive_2022.archive_202208;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/8/29 0029
 * @description https://leetcode.cn/problems/shuffle-the-array/
 */
public class Shuffle {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        System.out.println(Arrays.toString(new Shuffle().shuffle(nums, n)));
    }

    //简单模拟
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[2 * n];
        for (int i = 0; i < n; i++) {
            res[2 * i] = nums[i];
            res[2 * i + 1] = nums[i + n];
        }
        return res;
    }
}
