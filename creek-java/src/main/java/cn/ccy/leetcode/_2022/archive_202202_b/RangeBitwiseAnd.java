package cn.ccy.leetcode._2022.archive_202202_b;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/16
 * @description https://leetcode-cn.com/problems/bitwise-and-of-numbers-range/
 * ★★
 */
public class RangeBitwiseAnd {
    public static void main(String[] args) {
        System.out.println(new RangeBitwiseAnd().rangeBitwiseAnd(5, 7));
    }

    public int rangeBitwiseAnd(int left, int right) {
        int shift = 0;
        while (left < right) {
            left >>= 1;
            right >>= 1;
            ++shift;
        }
        return right << shift;
    }
}
