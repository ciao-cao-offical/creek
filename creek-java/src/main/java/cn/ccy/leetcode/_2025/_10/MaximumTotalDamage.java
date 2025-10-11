package cn.ccy.leetcode._2025._10;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/maximum-total-damage-with-spell-casting/?envType=daily-question&envId=2025-10-11">3186. 施咒的最大总伤害</a>
 * @since 2025/10/11 22:09
 */
public class MaximumTotalDamage {
    public static void main(String[] args) {

    }

    public long maximumTotalDamage(int[] power) {
        TreeMap<Integer, Integer> count = new TreeMap<>();
        for (int p : power) {
            count.put(p, count.getOrDefault(p, 0) + 1);
        }
        List<int[]> vec = new ArrayList<>();
        vec.add(new int[]{-1000000000, 0});
        for (Map.Entry<Integer, Integer> e : count.entrySet()) {
            vec.add(new int[]{e.getKey(), e.getValue()});
        }
        int n = vec.size();
        long[] f = new long[n];
        long mx = 0, ans = 0;
        int j = 1;
        for (int i = 1; i < n; i++) {
            while (j < i && vec.get(j)[0] < vec.get(i)[0] - 2) {
                mx = Math.max(mx, f[j]);
                j++;
            }
            f[i] = mx + 1L * vec.get(i)[0] * vec.get(i)[1];
            ans = Math.max(ans, f[i]);
        }
        return ans;
    }
}
