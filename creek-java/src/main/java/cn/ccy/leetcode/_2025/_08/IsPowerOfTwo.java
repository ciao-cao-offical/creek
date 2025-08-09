package cn.ccy.leetcode._2025._08;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/power-of-two/?envType=daily-question&envId=2025-08-09">231. 2 的幂</a>
 * @since 2025/8/9 21:44
 */
public class IsPowerOfTwo {
    public static void main(String[] args) {

    }

    public boolean isPowerOfTwo(int n) {
        // return n > 0 && (n & (n - 1)) == 0;
        return n > 0 && (n & -n) == n;
    }
}
