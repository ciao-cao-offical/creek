package cn.ccy.leetcode._2025._08;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/range-product-queries-of-powers/?envType=daily-question&envId=2025-08-11">2438. 二的幂数组中查询范围内的乘积</a>
 * @since 2025/8/11 23:36
 */
public class ProductQueries {
    public static void main(String[] args) {

    }

    private static final int MOD = 1000000007;

    public int[] productQueries(int n, int[][] queries) {
        List<Integer> bins = new ArrayList<>();
        int rep = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                bins.add(rep);
            }
            n /= 2;
            rep *= 2;
        }

        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            long cur = 1;
            int start = queries[i][0];
            int end = queries[i][1];
            for (int j = start; j <= end; j++) {
                cur = (cur * bins.get(j)) % MOD;
            }
            ans[i] = (int) cur;
        }
        return ans;
    }
}
