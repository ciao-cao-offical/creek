package cn.ccy.leetcode.archive_202202_b;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/18
 * @description https://leetcode-cn.com/problems/count-odd-numbers-in-an-interval-range/
 */
public class CountOdds {
    public static void main(String[] args) {
        System.out.println(new CountOdds().countOdds(3, 7));
    }

    public int countOdds(int low, int high) {
        return (high + 1 >> 1) - (low >> 1);
    }
}
