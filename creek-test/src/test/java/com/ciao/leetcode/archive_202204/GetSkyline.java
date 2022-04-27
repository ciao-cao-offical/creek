package com.ciao.leetcode.archive_202204;

import java.util.*;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/4/27 0027
 * @description https://leetcode-cn.com/problems/the-skyline-problem/
 * ☆☆☆☆☆ 看一下【宫水三叶】的【扫描线算法基本思路 & 优先队列维护当前最大高度】
 */
public class GetSkyline {
    public static void main(String[] args) {
        int[][] buildings = {{2, 9, 10}, {3, 7, 15}, {5, 12, 12}, {15, 20, 10}, {19, 24, 8}};
        System.out.println(new GetSkyline().getSkyline(buildings));
    }

    public List<List<Integer>> getSkyline(int[][] buildings) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o2[1] - o1[1]);
        List<Integer> boundaries = new ArrayList<>();
        for (int[] build : buildings) {
            //记录左边界
            boundaries.add(build[0]);
            //记录右边界
            boundaries.add(build[1]);
        }
        Collections.sort(boundaries);
        List<List<Integer>> ret = new ArrayList<>();
        int n = buildings.length;
        int idx = 0;
        for (int boundary : boundaries) {
            while (idx < n && buildings[idx][0] <= boundary) {
                //左边界小于等于boundary的记录入优先队列，优先队列仅记录右边界和高
                pq.offer(new int[]{buildings[idx][1], buildings[idx][2]});
                idx++;
            }

            while (!pq.isEmpty() && pq.peek()[0] <= boundary) {
                //优先队列非空，且队首元素右边界小于当前boundary，则弹出队首元素
                pq.poll();
            }

            //优先队列队首元素高或者是天际线右边界
            int maxn = pq.isEmpty() ? 0 : pq.peek()[1];
            if (ret.size() == 0 || maxn != ret.get(ret.size() - 1).get(1)) {
                ret.add(Arrays.asList(boundary, maxn));
            }
        }

        return ret;
    }
}
