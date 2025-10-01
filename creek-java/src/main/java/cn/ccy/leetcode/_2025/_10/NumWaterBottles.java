package cn.ccy.leetcode._2025._10;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/water-bottles/?envType=daily-question&envId=2025-10-01">1518. 换水问题</a>
 * @since 2025/10/1 22:53
 */
public class NumWaterBottles {
    public static void main(String[] args) {

    }

    public int numWaterBottles(int numBottles, int numExchange) {
        int total = numBottles;
        while (numBottles >= numExchange) {
            total += numBottles / numExchange;
            numBottles = numBottles / numExchange + numBottles % numExchange;
        }

        return total;
    }
}
