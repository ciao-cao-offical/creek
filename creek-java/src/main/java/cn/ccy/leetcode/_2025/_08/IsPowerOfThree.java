package cn.ccy.leetcode._2025._08;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/power-of-three/?envType=daily-question&envId=2025-08-13">326. 3 的幂</a>
 * @since 2025/8/13 22:31
 */
public class IsPowerOfThree {
    public static void main(String[] args) {

    }

    public boolean isPowerOfThree(int n) {
        while (n != 0 && n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }
}
