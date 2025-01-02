package cn.ccy.leetcode._2022.archive_202208;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/8/28 0028
 * @description https://leetcode.cn/problems/preimage-size-of-factorial-zeroes-function/
 */
public class PreimageSizeFZF {
    public static void main(String[] args) {

    }

    public int preimageSizeFZF(int k) {
        if (k <= 1) return 5;
        return f(k) - f(k - 1);
    }

    int f(int x) {
        long l = 0, r = (long) 1e10;
        while (l < r) {
            long mid = l + r + 1 >> 1;
            if (getCnt(mid) <= x) l = mid;
            else r = mid - 1;
        }
        return (int) r;
    }

    long getCnt(long x) {
        long ans = 0;
        while (x != 0) {
            ans += x / 5;
            x /= 5;
        }
        return ans;
    }
}
