package cn.ccy.leetcode.archive_202306;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/6/17 0017 21:32:43
 * @description https://leetcode.cn/problems/minimum-cuts-to-divide-a-circle/
 */
public class NumberOfCuts {
    public static void main(String[] args) {

    }

    public int numberOfCuts(int n) {
        if (n == 1) {
            return 0;
        }

        if (n % 2 == 0) {
            return n / 2;
        }
        return n;
    }
}
