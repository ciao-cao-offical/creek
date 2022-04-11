package com.ciao.leetcode.archive_202204;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/11
 * @description https://leetcode-cn.com/problems/count-numbers-with-unique-digits/
 * ⭐️⭐️ 试试【数位 DP】-【宫水三叶】
 */
public class CountNumbersWithUniqueDigits {
    public static void main(String[] args) {
        System.out.println(new CountNumbersWithUniqueDigits().countNumbersWithUniqueDigits(2));
    }

    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0){
            return 1;
        }
        if (n == 1){
            return 10;
        }
        int res = 10;
        int cur = 9;
        for (int i = 0;i < n-1;i++){
            cur *= (9-i);
            res += cur;
        }
        return res;
    }
}
