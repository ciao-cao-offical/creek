package cn.ccy.leetcode._2025._03;

import java.util.*;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/minimum-reverse-operations/?envType=daily-question&envId=2025-03-20">2612. 最少翻转操作数</a>
 * @since 2025/3/20 00:03
 * ☆☆☆☆☆ 2025cvd
 */
public class MinReverseOperations {
    public static void main(String[] args) {

    }

    public int[] minReverseOperations(int n, int p, int[] banned, int k) {
        Set<Integer> ban = new HashSet<>();
        for (int b : banned) ban.add(b);
        TreeSet<Integer>[] sets = new TreeSet[2];
        sets[0] = new TreeSet<>();
        sets[1] = new TreeSet<>();
        for (int i = 0; i < n; ++i) {
            if (i != p && !ban.contains(i)) {
                sets[i % 2].add(i);
            }
        }
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        Queue<Integer> q = new LinkedList<>();
        q.add(p);
        ans[p] = 0;
        while (!q.isEmpty()) {
            int i = q.poll();
            int mn = Math.max(i - k + 1, k - i - 1);
            int mx = Math.min(i + k - 1, n * 2 - k - i - 1);
            TreeSet<Integer> set = sets[mx % 2];
            Integer it = sets[mx % 2].ceiling(mn);
            while (it != null && it <= mx) {
                ans[it] = ans[i] + 1;
                q.add(it);
                set.remove(it);
                it = set.ceiling(mn);
            }
        }
        return ans;
    }
}
