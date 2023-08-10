package cn.ccy.leetcode.archive_202304;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/4/2 0002 21:38:26
 * @description https://leetcode.cn/problems/minimum-score-triangulation-of-polygon/
 */
public class MinScoreTriangulation {
    public static void main(String[] args) {

    }

    int[] value;
    int[][] cache;

    //递归，只能说灵神还是yyds呀，🐂（我这个脑子吧，还是就先学会简单的就行了，T^T）
    public int minScoreTriangulation(int[] values) {
        this.value = values;
        int len = values.length;
        cache = new int[len][len];
        for (int[] c : cache) {
            Arrays.fill(c, -1);
        }
        return dfs(0, len - 1);
    }

    private int dfs(int start, int end) {
        if (start == end - 1) {
            return 0;
        }

        if (cache[start][end] != -1) {
            return cache[start][end];
        }

        int min = Integer.MAX_VALUE;
        for (int i = start + 1; i < end; i++) {
            min = Math.min(min, dfs(start, i) + dfs(i, end) + value[start] * value[i] * value[end]);
        }

        return cache[start][end] = min;
    }
}
