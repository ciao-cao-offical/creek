package cn.ccy.leetcode.archive_202202_b;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/1/25
 * @description https://leetcode-cn.com/problems/count-of-matches-in-tournament/
 */
public class NumberOfMatches {
    public static void main(String[] args) {
        System.out.println(new NumberOfMatches().numberOfMatches(14));
    }

    public int numberOfMatches(int n) {
        if (n == 0 || n == 1) {
            return 0;
        }

        int re = n % 2;
        int i = n / 2;
        int sum = i;
        sum += numberOfMatches(re == 0 ? i : i + 1);

        return sum;
    }
}
