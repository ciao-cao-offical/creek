package cn.ccy.leetcode.archive_202408;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/8/23 00:03:10
 * @description https://leetcode.cn/problems/find-products-of-elements-of-big-array/?envType=daily-question&envId=2024-08-23
 * ☆☆☆☆☆ 2024cvd
 */
public class FindProductsOfElements {
    public static void main(String[] args) {

    }

    public int[] findProductsOfElements(long[][] queries) {
        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            // 偏移让数组下标从1开始
            queries[i][0]++;
            queries[i][1]++;
            long l = midCheck(queries[i][0]);
            long r = midCheck(queries[i][1]);
            int mod = (int) queries[i][2];

            long res = 1;
            long pre = countOne(l - 1);
            for (int j = 0; j < 60; j++) {
                if ((1L << j & l) != 0) {
                    pre++;
                    if (pre >= queries[i][0] && pre <= queries[i][1]) {
                        res = res * (1L << j) % mod;
                    }
                }
            }

            if (r > l) {
                long bac = countOne(r - 1);
                for (int j = 0; j < 60; j++) {
                    if ((1L << j & r) != 0) {
                        bac++;
                        if (bac >= queries[i][0] && bac <= queries[i][1]) {
                            res = res * (1L << j) % mod;
                        }
                    }
                }
            }

            if (r - l > 1) {
                long xs = countPow(r - 1) - countPow(l);
                res = res * powMod(2L, xs, mod) % mod;
            }
            ans[i] = (int) res;
        }

        return ans;
    }

    public long midCheck(long x) {
        long l = 1, r = (long) 1e15;
        while (l < r) {
            long mid = (l + r) >> 1;
            if (countOne(mid) >= x) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return r;
    }

    // 计算 <= x 所有数的数位1的和
    public long countOne(long x) {
        long res = 0;
        int sum = 0;

        for (int i = 60; i >= 0; i--) {
            if ((1L << i & x) != 0) {
                res += 1L * sum * (1L << i);
                sum += 1;

                if (i > 0) {
                    res += 1L * i * (1L << (i - 1));
                }
            }
        }
        res += sum;
        return res;
    }

    // 计算 <= x 所有数的数位对幂的贡献之和
    public long countPow(long x) {
        long res = 0;
        int sum = 0;

        for (int i = 60; i >= 0; i--) {
            if ((1L << i & x) != 0) {
                res += 1L * sum * (1L << i);
                sum += i;

                if (i > 0) {
                    res += 1L * i * (i - 1) / 2 * (1L << (i - 1));
                }
            }
        }
        res += sum;
        return res;
    }

    public int powMod(long x, long y, int mod) {
        long res = 1;
        while (y != 0) {
            if ((y & 1) != 0) {
                res = res * x % mod;
            }
            x = x * x % mod;
            y >>= 1;
        }
        return (int) res;
    }
}
