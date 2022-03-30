package com.ciao.leetcode.archive_202203;

import java.util.*;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/30 0030
 * @description https://leetcode-cn.com/problems/find-servers-that-handled-most-number-of-requests/
 * ☆☆☆☆☆ cv 试试【模拟 + 双优先队列】
 */
public class BusiestServers {
    public static void main(String[] args) {
        int k = 3;
        int[] arrival = {1, 2, 3, 4, 5};
        int[] load = {5, 2, 3, 3, 3};
        System.out.println(new BusiestServers().busiestServers(k, arrival, load));
    }

    public List<Integer> busiestServers(int k, int[] arrival, int[] load) {
        TreeSet<Integer> available = new TreeSet<>();
        for (int i = 0; i < k; i++) {
            available.add(i);
        }

        PriorityQueue<int[]> busy = new PriorityQueue<>(Comparator.comparingInt(o -> o[0]));
        int[] requests = new int[k];
        for (int i = 0; i < arrival.length; i++) {
            while (!busy.isEmpty() && busy.peek()[0] <= arrival[i]) {
                available.add(busy.poll()[1]);
            }

            if (available.isEmpty()) {
                continue;
            }

            Integer p = available.ceiling(i % k);
            if (p == null) {
                p = available.first();
            }

            requests[p]++;
            busy.offer(new int[]{arrival[i] + load[i], p});
            available.remove(p);
        }

        int maxRequest = Arrays.stream(requests).max().getAsInt();
        List<Integer> ret = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            if (requests[i] == maxRequest) {
                ret.add(i);
            }
        }

        return ret;
    }
}
