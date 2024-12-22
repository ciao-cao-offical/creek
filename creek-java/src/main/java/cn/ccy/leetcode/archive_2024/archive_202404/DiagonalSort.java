package cn.ccy.leetcode.archive_2024.archive_202404;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/4/29 22:08:25
 * @description https://leetcode.cn/problems/sort-the-matrix-diagonally/solutions/2754949/jiang-ju-zhen-an-dui-jiao-xian-pai-xu-by-fsf0/?envType=daily-question&envId=2024-04-29
 */
public class DiagonalSort {
    public static void main(String[] args) {

    }

    public int[][] diagonalSort(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        List<List<Integer>> diag = new ArrayList<>(m + n);
        for (int i = 0; i < m + n; i++) {
            diag.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                diag.get(i - j + m).add(mat[i][j]);
            }
        }
        for (List<Integer> d : diag) {
            Collections.sort(d, Collections.reverseOrder());
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = diag.get(i - j + m).remove(diag.get(i - j + m).size() - 1);
            }
        }
        return mat;
    }
}
