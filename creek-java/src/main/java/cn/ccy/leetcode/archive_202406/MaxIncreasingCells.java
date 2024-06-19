package cn.ccy.leetcode.archive_202406;

import java.util.*;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/6/19 21:45:36
 * @description https://leetcode.cn/problems/maximum-strictly-increasing-cells-in-a-matrix/?envType=daily-question&envId=2024-06-19
 * ☆☆☆☆☆ 2024cvd
 */
public class MaxIncreasingCells {
    public static void main(String[] args) {

    }

    public int maxIncreasingCells(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        Map<Integer, List<int[]>> mp = new HashMap<Integer, List<int[]>>();
        int[] row = new int[m];
        int[] col = new int[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mp.putIfAbsent(mat[i][j], new ArrayList<int[]>());
                mp.get(mat[i][j]).add(new int[]{i, j});
            }
        }
        List<Integer> keys = new ArrayList<Integer>(mp.keySet());
        Collections.sort(keys);
        for (int key : keys) {
            List<int[]> pos = mp.get(key);
            List<Integer> res = new ArrayList<Integer>(); // 存放相同数值的答案，便于后续更新 row 和 col
            for (int[] arr : pos) {
                res.add(Math.max(row[arr[0]], col[arr[1]]) + 1);
            }
            for (int i = 0; i < pos.size(); i++) {
                int[] arr = pos.get(i);
                int d = res.get(i);
                row[arr[0]] = Math.max(row[arr[0]], d);
                col[arr[1]] = Math.max(col[arr[1]], d);
            }
        }
        return Arrays.stream(row).max().getAsInt();
    }
}
