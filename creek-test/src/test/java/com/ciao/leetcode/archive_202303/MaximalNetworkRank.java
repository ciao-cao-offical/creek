package com.ciao.leetcode.archive_202303;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/3/15 0015 22:40:19
 * @description https://leetcode.cn/problems/maximal-network-rank/
 */
public class MaximalNetworkRank {
    public static void main(String[] args) {
        //int n = 8;
        //int[][] roads = {{0, 1}, {1, 2}, {2, 3}, {2, 4}, {5, 6}, {5, 7}};
        int n = 2;
        int[][] roads = {};
        System.out.println(new MaximalNetworkRank().maximalNetworkRank(n, roads));
    }

    //枚举
    public int maximalNetworkRank(int n, int[][] roads) {
        boolean[][] connect = new boolean[n][n];
        int[] degree = new int[n];
        for (int[] v : roads) {
            connect[v[0]][v[1]] = true;
            connect[v[1]][v[0]] = true;
            degree[v[0]]++;
            degree[v[1]]++;
        }

        int maxRank = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int rank = degree[i] + degree[j] - (connect[i][j] ? 1 : 0);
                maxRank = Math.max(maxRank, rank);
            }
        }
        return maxRank;
    }
}
