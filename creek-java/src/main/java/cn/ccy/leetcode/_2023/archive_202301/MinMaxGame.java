package cn.ccy.leetcode._2023.archive_202301;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/1/15 0015 19:47:58
 * @description https://leetcode.cn/problems/min-max-game/
 */
public class MinMaxGame {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 2, 4, 8, 2, 2};
        System.out.println(new MinMaxGame().minMaxGame(nums));
    }

    public int minMaxGame(int[] nums) {
        int len = nums.length;
        while (len > 1) {
            int newLen = len / 2;
            int[] newNums = new int[newLen];
            for (int i = 0; i < newLen; i++) {
                if ((i & 1) == 1) {
                    newNums[i] = Math.max(nums[2 * i], nums[2 * i + 1]);

                } else {
                    newNums[i] = Math.min(nums[2 * i], nums[2 * i + 1]);
                }
            }

            len = newLen;
            nums = newNums;
        }

        return nums[0];
    }
}
