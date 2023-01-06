package com.ciao.leetcode.archive_202301;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/1/6
 * @description https://leetcode.cn/problems/count-integers-with-even-digit-sum/
 */
public class CountEven {
    public static void main(String[] args) {
        int num = 910;
        System.out.println(new CountEven().countEven(num));
    }

    public int countEven(int num) {
        int res = 0;
        for (int i = 2; i <= num; i++) {
            int x = i, sum = 0;
            while (x != 0) {
                sum += x % 10;
                x /= 10;
            }
            if (sum % 2 == 0) {
                res++;
            }
        }
        return res;
    }
}
