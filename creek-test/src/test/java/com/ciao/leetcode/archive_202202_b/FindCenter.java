package com.ciao.leetcode.archive_202202_b;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/18
 * @description https://leetcode-cn.com/problems/find-center-of-star-graph/
 */
public class FindCenter {
    public static void main(String[] args) {
        int[][] edges = {{1, 2}, {2, 3}, {4, 2}};
        System.out.println(new FindCenter().findCenter(edges));
    }

    public int findCenter(int[][] edges) {
        if (edges == null) {
            return -1;
        }
        if (edges.length == 1) {
            return edges[0][0];
        }

        if (edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]) {
            return edges[0][0];

        } else {
            return edges[0][1];
        }
    }
}
