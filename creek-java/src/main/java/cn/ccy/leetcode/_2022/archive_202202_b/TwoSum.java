package cn.ccy.leetcode._2022.archive_202202_b;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/1/18
 * @description https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/
 */
public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new TwoSum().twoSum(new int[]{1, 2, 3, 4, 4, 9, 56, 90}, 8)));
    }

    public int[] twoSum(int[] numbers, int target) {
        int len = numbers.length, a = 0, b = a + 1;
        while (a < len) {
            if (numbers[a] + numbers[b] == target) {
                return new int[]{a + 1, b + 1};
            }
            if (b == len - 1) {
                a++;
                b = a + 1;

            } else {
                b++;
            }
        }
        return new int[]{-1, -1};
    }
}
