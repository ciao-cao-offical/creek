package com.ciao.leetcode.archive_202205;

import java.util.*;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/5/7 0007
 * @description 简要描述当前类の作用
 * ☆☆☆ 试试【方法二：预处理优化】和【宫水三叶の解答】
 */
public class MinMutation {
    public static void main(String[] args) {
        String start = "AACCGGTT";
        String end = "AACCGGTA";
        String[] bank = {"AACCGGTA"};
        System.out.println(new MinMutation().minMutation(start, end, bank));
    }

    //广度优先算法
    public int minMutation(String start, String end, String[] bank) {
        if (start.equals(end)) {
            return 0;
        }
        if (bank.length == 0) {
            return -1;
        }
        Set<String> cnt = new HashSet<>(Arrays.asList(bank));
        if (!cnt.contains(end)) {
            return -1;
        }
        char[] keys = {'A', 'C', 'G', 'T'};
        Set<String> visited = new HashSet<>();

        Deque<String> dq = new ArrayDeque<>();
        dq.offer(start);
        visited.add(start);
        int step = 1;
        while (!dq.isEmpty()) {
            int sz = dq.size();
            for (int i = 0; i < sz; i++) {
                String poll = dq.poll();
                //字符串遍历
                for (int j = 0; j < 8; j++) {
                    //遍历key
                    for (int k = 0; k < 4; k++) {
                        if (poll.charAt(j) != keys[k]) {
                            StringBuilder sb = new StringBuilder(poll);
                            sb.setCharAt(j, keys[k]);
                            String s = sb.toString();
                            if (!visited.contains(s) && cnt.contains(s)) {
                                if (end.equals(s)) {
                                    return step;
                                }

                                visited.add(s);
                                dq.offer(s);
                            }
                        }
                    }
                }
            }

            step++;
        }

        return -1;
    }
}
