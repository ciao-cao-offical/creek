package cn.ccy.leetcode._2025._05;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/three-consecutive-odds/?envType=daily-question&envId=2025-05-11">1550. 存在连续三个奇数的数组</a>
 * @since 2025/5/11 21:40
 */
public class ThreeConsecutiveOdds {
    public static void main(String[] args) {

    }

    public boolean threeConsecutiveOdds(int[] arr) {
        for (int i = 0; i < arr.length - 2; i++) {
            if ((arr[i] & 1) == 1 && (arr[i + 1] & 1) == 1 && (arr[i + 2] & 1) == 1) {
                return true;
            }
        }

        return false;
    }
}
