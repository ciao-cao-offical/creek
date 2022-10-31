package com.ciao.leetcode.archive_202209;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/10/31
 * @description https://leetcode.cn/problems/magical-string/
 * 双十一大促来啦，开门红！阿弥陀佛，㊗️顺利！
 */
public class MagicalString {
    public static void main(String[] args) {
        System.out.println(new MagicalString().magicalString(6));
    }

    //双指针
    public int magicalString(int n) {
        if (n < 4) {
            return 1;
        }
        char[] s = new char[n];
        s[0] = '1';
        s[1] = '2';
        s[2] = '2';
        int res = 1;
        int i = 2;
        int j = 3;
        while (j < n) {
            int size = s[i] - '0';
            int num = 3 - (s[j - 1] - '0');
            while (size > 0 && j < n) {
                s[j] = (char) ('0' + num);
                if (num == 1) {
                    ++res;
                }
                ++j;
                --size;
            }
            ++i;
        }
        return res;
    }
}
