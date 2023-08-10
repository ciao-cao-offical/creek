package cn.ccy.leetcode.archive_202304;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/4/5 0005 21:24:59
 * @description https://leetcode.cn/problems/number-of-common-factors/
 */
public class CommonFactors {
    public static void main(String[] args) {
        System.out.println(new CommonFactors().commonFactors(12, 6));
    }

    public int commonFactors(int a, int b) {
        int count = 0;
        int cf = 1;
        while (cf <= a && cf <= b) {
            if (a % cf == 0 && b % cf == 0) {
                count++;
            }

            cf++;
        }
        return count;
    }
}
