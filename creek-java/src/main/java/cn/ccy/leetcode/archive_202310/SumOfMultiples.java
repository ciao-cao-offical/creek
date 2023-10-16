package cn.ccy.leetcode.archive_202310;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/10/17 0017 01:43:13
 * @description https://leetcode.cn/problems/sum-multiples/description/?envType=daily-question&envId=2023-10-17
 */
public class SumOfMultiples {
    public static void main(String[] args) {

    }

    public int sumOfMultiples(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                res += i;
            }
        }
        return res;
    }
}
