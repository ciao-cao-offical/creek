package cn.ccy.leetcode._2025._05;

import java.util.*;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @see <a href="https://leetcode.cn/problems/push-dominoes/?envType=daily-question&envId=2025-05-02">838. 推多米诺</a>
 * @since 2025/5/2 23:00
 */
public class PushDominoes {
    public static void main(String[] args) {

    }

    public String pushDominoes(String dominoes) {
        int n = dominoes.length();
        Deque<Integer> queue = new ArrayDeque<Integer>();
        int[] time = new int[n];
        Arrays.fill(time, -1);
        List<Character>[] force = new List[n];
        for (int i = 0; i < n; i++) {
            force[i] = new ArrayList<Character>();
        }
        for (int i = 0; i < n; i++) {
            char f = dominoes.charAt(i);
            if (f != '.') {
                queue.offer(i);
                time[i] = 0;
                force[i].add(f);
            }
        }

        char[] res = new char[n];
        Arrays.fill(res, '.');
        while (!queue.isEmpty()) {
            int i = queue.poll();
            if (force[i].size() == 1) {
                char f = force[i].get(0);
                res[i] = f;
                int ni = f == 'L' ? i - 1 : i + 1;
                if (ni >= 0 && ni < n) {
                    int t = time[i];
                    if (time[ni] == -1) {
                        queue.offer(ni);
                        time[ni] = t + 1;
                        force[ni].add(f);
                    } else if (time[ni] == t + 1) {
                        force[ni].add(f);
                    }
                }
            }
        }
        return new String(res);
    }
}
