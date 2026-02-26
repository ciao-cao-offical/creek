package cn.ccy.leetcode._2026._02;

import java.util.*;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/minimum-operations-to-equalize-binary-string/?envType=daily-question&envId=2026-02-27">3666. 使二进制字符串全为 1 的最少操作次数</a>
 * @since 2026/2/27 00:41
 * ☆☆☆☆☆ 2026cvd
 */
public class MinOperations {
    public static void main(String[] args) {

    }

    public int minOperations(String s, int k) {
        int n = s.length(), m = 0;
        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        List<TreeSet<Integer>> nodeSets = new ArrayList<>();
        nodeSets.add(new TreeSet<>());
        nodeSets.add(new TreeSet<>());
        for (int i = 0; i <= n; i++) {
            nodeSets.get(i % 2).add(i);
            if (i < n && s.charAt(i) == '0') {
                m++;
            }
        }
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(m);
        dist[m] = 0;
        nodeSets.get(m % 2).remove(m);
        while (!q.isEmpty()) {
            m = q.poll();
            int c1 = Math.max(k - n + m, 0), c2 = Math.min(m, k);
            int lnode = m + k - 2 * c2, rnode = m + k - 2 * c1;
            TreeSet<Integer> nodeSet = nodeSets.get(lnode % 2);
            for (Integer m2 = nodeSet.ceiling(lnode); m2 != null && m2 <= rnode; m2 = nodeSet.ceiling(lnode)) {
                dist[m2] = dist[m] + 1;
                q.offer(m2);
                nodeSet.remove(m2);
            }
        }
        return dist[0] == Integer.MAX_VALUE ? -1 : dist[0];
    }
}
