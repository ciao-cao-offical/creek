package cn.ccy.leetcode._2025._08;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/power-of-four/?envType=daily-question&envId=2025-08-15">342. 4的幂</a>
 * @since 2025/8/15 23:08
 */
public class IsPowerOfFour {
    public static void main(String[] args) {

    }

    public boolean isPowerOfFour(int n) {
        return (n & (n - 1)) == 0 && n % 3 == 1;
    }
}
