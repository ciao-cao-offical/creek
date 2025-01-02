package cn.ccy.leetcode._2022.archive_202203;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/3/20 0020
 * @description https://leetcode-cn.com/problems/the-time-when-the-network-becomes-idle/
 * ☆☆☆
 */
public class NetworkBecomesIdle {
    public static void main(String[] args) {
        int[][] edges = {{0, 1}, {0, 2}, {1, 2}};
        int[] patience = {0, 10, 10};
        System.out.println(new NetworkBecomesIdle().networkBecomesIdle(edges, patience));
    }

    public int networkBecomesIdle(int[][] edges, int[] patience) {
        int len = patience.length;
        List<Integer>[] services = new List[len];
        for (int i = 0; i < len; i++) {
            services[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            services[edge[0]].add(edge[1]);
            services[edge[1]].add(edge[0]);
        }

        boolean[] visited = new boolean[len];
        visited[0] = true;

        Deque<Integer> deque = new ArrayDeque<>();
        deque.offer(0);
        int dist = 1;
        int ans = 0;
        while (!deque.isEmpty()) {
            //广度优先 按层遍历
            int size = deque.size();
            for (int i = 0; i < size; i++) {
                Integer pop = deque.pop();
                for (int service : services[pop]) {
                    if (visited[service]) {
                        continue;
                    }
                    visited[service] = true;
                    deque.offer(service);
                    int time = patience[service] * ((2 * dist - 1) / patience[service]) + 2 * dist + 1;
                    ans = Math.max(ans, time);
                }
            }
            dist++;
        }
        return ans;
    }

}
