package com.ciao.leetcode.archive_202203;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/3
 * @description https://leetcode-cn.com/problems/add-digits/
 */
public class AddDigits {
    public static void main(String[] args) {
        int num = 38;
        System.out.println(new AddDigits().addDigits(num));
    }

    public int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }

        return num;
    }
}
