package cn.ccy.leetcode._2024.archive_202410;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/10/14 00:08:14
 * @description https://leetcode.cn/problems/super-egg-drop/?envType=daily-question&envId=2024-10-14
 * ☆☆☆☆☆ 2024cvd
 */
public class SuperEggDrop {
    public static void main(String[] args) {

    }

    Map<Integer, Integer> memo = new HashMap<Integer, Integer>();

    public int superEggDrop(int k, int n) {
        return dp(k, n);
    }

    public int dp(int k, int n) {
        if (!memo.containsKey(n * 100 + k)) {
            int ans;
            if (n == 0) {
                ans = 0;
            } else if (k == 1) {
                ans = n;
            } else {
                int lo = 1, hi = n;
                while (lo + 1 < hi) {
                    int x = (lo + hi) / 2;
                    int t1 = dp(k - 1, x - 1);
                    int t2 = dp(k, n - x);

                    if (t1 < t2) {
                        lo = x;
                    } else if (t1 > t2) {
                        hi = x;
                    } else {
                        lo = hi = x;
                    }
                }

                ans = 1 + Math.min(Math.max(dp(k - 1, lo - 1), dp(k, n - lo)), Math.max(dp(k - 1, hi - 1), dp(k, n - hi)));
            }

            memo.put(n * 100 + k, ans);
        }

        return memo.get(n * 100 + k);
    }
}
