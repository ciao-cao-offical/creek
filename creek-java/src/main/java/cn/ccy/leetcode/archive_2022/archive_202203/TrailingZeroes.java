package cn.ccy.leetcode.archive_2022.archive_202203;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/25 0025
 * @description https://leetcode-cn.com/problems/factorial-trailing-zeroes/
 */
public class TrailingZeroes {
    public static void main(String[] args) {
        System.out.println(new TrailingZeroes().trailingZeroes(3));
    }


    public int trailingZeroes(int n) {
        return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
    }
}
