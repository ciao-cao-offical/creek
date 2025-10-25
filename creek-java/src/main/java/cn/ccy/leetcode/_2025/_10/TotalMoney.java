package cn.ccy.leetcode._2025._10;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/calculate-money-in-leetcode-bank/?envType=daily-question&envId=2025-10-25">1716. 计算力扣银行的钱</a>
 * @since 2025/10/25 18:58
 */
public class TotalMoney {
    public static void main(String[] args) {

    }

    public int totalMoney(int n) {
        int total = 0;
        int round = n / 7;
        for (int i = 0; i < round + 1; i++) {
            for (int j = i + 1; j < i + 8 && n > 0; j++, n--) {
                total += j;
            }
        }
        return total;
    }
}
