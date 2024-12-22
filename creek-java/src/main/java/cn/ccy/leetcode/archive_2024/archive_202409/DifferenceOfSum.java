package cn.ccy.leetcode.archive_2024.archive_202409;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/9/26 04:16:04
 * @description https://leetcode.cn/problems/difference-between-element-sum-and-digit-sum-of-an-array/?envType=daily-question&envId=2024-09-26
 */
public class DifferenceOfSum {
    public static void main(String[] args) {

    }

    public int differenceOfSum(int[] nums) {
        int elementSum = 0, digitSum = 0;
        for (int num : nums) {
            elementSum += num;
            digitSum += getDigitSum(num);
        }
        return Math.abs(elementSum - digitSum);
    }

    public int getDigitSum(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
