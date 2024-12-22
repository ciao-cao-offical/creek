package cn.ccy.leetcode.archive_2023.archive_202301;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Chengyin
 * @version v 1.0.0
 * @date 2023/1/22
 * @description https://leetcode.cn/problems/maximum-number-of-groups-getting-fresh-donuts/description/
 * ★★★★★ cvd【位运算】 from：https://leetcode.cn/problems/maximum-number-of-groups-getting-fresh-donuts/solutions/2072545/by-endlesscheng-r5ve/
 */
public class MaxHappyGroups {
    public static void main(String[] args) {

    }

    private int m;
    private int[] val;
    private final Map<Integer, Integer> cache = new HashMap<>();

    public int maxHappyGroups(int batchSize, int[] groups) {
        m = batchSize;
        int ans = 0;
        int[] cnt = new int[m];
        for (int x : groups) {
            x %= m;
            if (x == 0) ++ans; // 直接排在最前面
            else if (cnt[m - x] > 0) {
                --cnt[m - x]; // 配对
                ++ans;
            } else ++cnt[x];
        }

        int mask = 0, n = 0;
        for (int c : cnt) if (c > 0) ++n;
        val = new int[n];
        for (int x = 1; x < m; ++x)
            if (cnt[x] > 0) {
                val[--n] = x; // val 越靠后的，在 mask 中的比特位越高
                mask = mask << 5 | cnt[x];
            }

        return ans + dfs(mask);
    }

    private int dfs(int mask) {
        if (cache.containsKey(mask)) return cache.get(mask);
        int res = 0, left = mask >> 20, msk = mask & ((1 << 20) - 1);
        for (int i = 0, j = 0; i < val.length; ++i, j += 5) // 枚举顾客
            if ((msk >> j & 31) > 0) // cnt[val[i]] > 0
                res = Math.max(res, (left == 0 ? 1 : 0) + dfs((left + val[i]) % m << 20 | msk - (1 << j)));
        cache.put(mask, res);
        return res;
    }
}
