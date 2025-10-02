package cn.ccy.leetcode._2025._10;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/water-bottles-ii/?envType=daily-question&envId=2025-10-02">3100. 换水问题 II</a>
 * @since 2025/10/2 23:19
 */
public class MaxBottlesDrunk {
    public static void main(String[] args) {

    }

    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int ans = numBottles;
        for (int empty = numBottles; empty >= numExchange; numExchange++) {
            ans++;
            empty -= numExchange - 1;
        }
        return ans;
    }
}
