package cn.ccy.leetcode._2024.archive_202406;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/6/7 22:03:29
 * @description https://leetcode.cn/problems/maximum-number-of-operations-with-the-same-score-i/?envType=daily-question&envId=2024-06-07
 */
public class MaxOperations {
    public static void main(String[] args) {

    }

    public int maxOperations(int[] nums) {
        int count = 1;
        int sum = nums[0] + nums[1];
        for (int i = 2, j = 3; i < nums.length - 1 && j < nums.length; i += 2, j += 2) {
            if (nums[i] + nums[j] == sum) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
