package cn.ccy.leetcode.archive_202408;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/8/20 星期二 23:40:15
 * @description https://leetcode.cn/problems/find-number-of-ways-to-reach-the-k-th-stair/?envType=daily-question&envId=2024-08-20
 * ☆☆☆☆☆ 2024cvd
 */
public class WaysToReachStair {
    public static void main(String[] args) {

    }

    public int waysToReachStair(int k) {
        int n = 0, npow = 1, ans = 0;
        while (true) {
            if (npow - n - 1 <= k && k <= npow) {
                ans += comb(n + 1, npow - k);
            } else if (npow - n - 1 > k) {
                break;
            }
            ++n;
            npow *= 2;
        }
        return ans;
    }

    public int comb(int n, int k) {
        long ans = 1;
        for (int i = n; i >= n - k + 1; --i) {
            ans *= i;
            ans /= n - i + 1;
        }
        return (int) ans;
    }
}
