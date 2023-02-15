package com.ciao.leetcode.archive_202302;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/2/15 0015 23:34:03
 * @description https://leetcode.cn/problems/check-if-it-is-a-good-array/
 * ☆☆☆ cvd...
 */
public class IsGoodArray {
    public static void main(String[] args) {

    }

    //【数论】，数学，...哎...😔
    public boolean isGoodArray(int[] nums) {
        int divisor = nums[0];
        for (int num : nums) {
            divisor = gcd(divisor, num);
            if (divisor == 1) {
                break;
            }
        }
        return divisor == 1;
    }

    public int gcd(int num1, int num2) {
        while (num2 != 0) {
            int temp = num1;
            num1 = num2;
            num2 = temp % num2;
        }
        return num1;
    }
}
