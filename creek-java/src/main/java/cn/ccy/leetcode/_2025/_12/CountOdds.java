package cn.ccy.leetcode._2025._12;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/count-odd-numbers-in-an-interval-range/?envType=daily-question&envId=2025-12-07">1523. 在区间范围内统计奇数数目</a>
 * @since 2025/12/7 22:47
 */
public class CountOdds {
    public static void main(String[] args) {

    }

    public int countOdds(int low, int high) {
        return odd(high) - odd(low - 1);
    }

    /*private int odd(int num) {
        return (num + 1) / 2;
    }*/

    private int odd(int num) {
        return (num + 1) >> 1;
    }
}
