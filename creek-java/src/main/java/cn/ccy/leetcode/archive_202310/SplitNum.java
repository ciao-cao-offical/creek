package cn.ccy.leetcode.archive_202310;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/10/9 0009 23:17:49
 * @description https://leetcode.cn/problems/split-with-minimum-sum/?envType=daily-question&envId=2023-10-09
 */
public class SplitNum {
    public static void main(String[] args) {

    }

    public int splitNum(int num) {
        char[] stnum = Integer.toString(num).toCharArray();
        Arrays.sort(stnum);
        int num1 = 0, num2 = 0;
        for (int i = 0; i < stnum.length; ++i) {
            if (i % 2 == 0) {
                num1 = num1 * 10 + (stnum[i] - '0');
            } else {
                num2 = num2 * 10 + (stnum[i] - '0');
            }
        }
        return num1 + num2;
    }
}
