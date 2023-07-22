package com.ciao.leetcode.archive_202307;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/7/22 0022 18:45:30
 * @description https://leetcode.cn/problems/lemonade-change/
 */
public class LemonadeChange {
    public static void main(String[] args) {

    }
    
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;
        for (int bill : bills) {
            if (bill == 5) {
                five++;

            } else if (bill == 10) {
                if (five >= 1) {
                    five--;
                    ten++;

                } else {
                    return false;
                }

            } else {
                if (five > 0 && ten > 0) {
                    five--;
                    ten--;

                } else if (five >= 3) {
                    five -= 3;

                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
