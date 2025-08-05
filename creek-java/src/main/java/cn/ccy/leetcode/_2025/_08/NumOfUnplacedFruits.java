package cn.ccy.leetcode._2025._08;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/fruits-into-baskets-ii/?envType=daily-question&envId=2025-08-05">3477. 水果成篮 II</a>
 * @since 2025/8/5 23:40
 */
public class NumOfUnplacedFruits {
    public static void main(String[] args) {

    }

    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count = 0;
        int n = baskets.length;
        for (int fruit : fruits) {
            int unset = 1;
            for (int i = 0; i < n; i++) {
                if (fruit <= baskets[i]) {
                    baskets[i] = 0;
                    unset = 0;
                    break;
                }
            }
            count += unset;
        }
        return count;
    }
}
