package cn.ccy.leetcode.archive_2023.archive_202312;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/12/1 0001 00:37:34
 * @description https://leetcode.cn/problems/first-completely-painted-row-or-column/?envType=daily-question&envId=2023-12-01
 * ☆☆☆ 2023b2t
 */
public class FirstCompleteIndex {
    public static void main(String[] args) {

    }

    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        Map<Integer, int[]> map = new HashMap<Integer, int[]>();
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                map.put(mat[i][j], new int[]{i, j});
            }
        }
        int[] rowCnt = new int[n];
        int[] colCnt = new int[m];
        for (int i = 0; i < arr.length; ++i) {
            int[] v = map.get(arr[i]);
            ++rowCnt[v[0]];
            if (rowCnt[v[0]] == m) {
                return i;
            }
            ++colCnt[v[1]];
            if (colCnt[v[1]] == n) {
                return i;
            }
        }
        return -1;
    }
}
