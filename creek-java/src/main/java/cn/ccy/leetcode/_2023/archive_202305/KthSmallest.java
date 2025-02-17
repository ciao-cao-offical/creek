package cn.ccy.leetcode._2023.archive_202305;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/5/28 0028 17:44:54
 * @description https://leetcode.cn/problems/find-the-kth-smallest-sum-of-a-matrix-with-sorted-rows/
 * cvd，★★★★★，let's DOTA2!
 */
public class KthSmallest {
    public static void main(String[] args) {

    }

    public int kthSmallest(int[][] mat, int k) {
        int m = mat.length;
        int[] prev = mat[0];
        for (int i = 1; i < m; ++i) {
            prev = merge(prev, mat[i], k);
        }
        return prev[k - 1];
    }

    public int[] merge(int[] f, int[] g, int k) {
        if (g.length > f.length) {
            return merge(g, f, k);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a, b) -> a[2] - b[2]);
        for (int i = 0; i < g.length; ++i) {
            pq.offer(new int[]{0, i, f[0] + g[i]});
        }

        List<Integer> list = new ArrayList<Integer>();
        while (k > 0 && !pq.isEmpty()) {
            int[] entry = pq.poll();
            list.add(entry[2]);
            if (entry[0] + 1 < f.length) {
                pq.offer(new int[]{entry[0] + 1, entry[1], f[entry[0] + 1] + g[entry[1]]});
            }
            --k;
        }

        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); ++i) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}
