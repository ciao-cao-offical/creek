package cn.ccy.leetcode._2022.archive_202208;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/8/7 0007
 * @description https://leetcode.cn/problems/exclusive-time-of-functions/
 * ☆☆☆ b2t
 */
public class ExclusiveTime {
    public static void main(String[] args) {
        int n = 2;
        List<String> logs = Arrays.asList("0:start:0", "1:start:2", "1:end:5", "0:end:6");
        System.out.println(Arrays.toString(new ExclusiveTime().exclusiveTime(n, logs)));
    }

    //栈 模拟
    public int[] exclusiveTime(int n, List<String> logs) {
        Deque<int[]> dq = new ArrayDeque<>();
        int[] res = new int[n];
        for (String log : logs) {
            String[] split = log.split(":");
            int id = Integer.parseInt(split[0]);
            String type = split[1];
            int time = Integer.parseInt(split[2]);

            if ("start".equals(type)) {
                if (!dq.isEmpty()) {
                    int[] peek = dq.peek();
                    res[peek[0]] += time - peek[1];
                }
                dq.push(new int[]{id, time});

            } else {
                int[] pop = dq.pop();
                res[pop[0]] += time - pop[1] + 1;
                if (!dq.isEmpty()) {
                    int[] peek = dq.peek();
                    peek[1] = time + 1;
                }
            }
        }

        return res;
    }
}
