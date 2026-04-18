package cn.ccy.leetcode._2026._04;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/mirror-distance-of-an-integer/?envType=daily-question&envId=2026-04-18">3783. 整数的镜像距离</a>
 * @since 2026/4/18 12:47
 */
public class MirrorDistance {
    public static void main(String[] args) {

    }
    
    public int reverse(int n) {
        int res = 0;
        while (n > 0) {
            res = res * 10 + n % 10;
            n /= 10;
        }
        return res;
    }

    public int mirrorDistance(int n) {
        return Math.abs(n - reverse(n));
    }
}
