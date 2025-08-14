package cn.ccy.leetcode._2025._08;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/check-if-number-is-a-sum-of-powers-of-three/?envType=daily-question&envId=2025-08-14">1780. 判断一个数字是否可以表示成三的幂的和</a>
 * @since 2025/8/14 23:40
 */
public class CheckPowersOfThree {
    public static void main(String[] args) {

    }

    public boolean checkPowersOfThree(int n) {
        while (n != 0) {
            if (n % 3 == 2) {
                return false;
            }
            n /= 3;
        }
        return true;
    }
}
