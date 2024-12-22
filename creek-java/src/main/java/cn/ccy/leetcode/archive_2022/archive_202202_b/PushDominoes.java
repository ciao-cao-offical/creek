package cn.ccy.leetcode.archive_2022.archive_202202_b;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/2/21
 * @description https://leetcode-cn.com/problems/push-dominoes/
 * ★★
 */
public class PushDominoes {
    public static void main(String[] args) {
        System.out.println(new PushDominoes().pushDominoes(".L.R...LR..L.."));
    }

    public String pushDominoes(String dominoes) {
        int len = dominoes.length();
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        int[] time = new int[len];
        Arrays.fill(time, -1);
        List<Character>[] force = new List[len];
        for (int i = 0; i < len; i++) {
            force[i] = new ArrayList<>();
        }
        for (int i = 0; i < len; i++) {
            char f = dominoes.charAt(i);
            if (f != '.') {
                queue.offer(i);
                time[i] = 0;
                force[i].add(f);
            }
        }
        char[] res = new char[len];
        Arrays.fill(res, '.');
        while (!queue.isEmpty()) {
            Integer poll = queue.poll();
            if (force[poll].size() == 1) {
                Character f = force[poll].get(0);
                res[poll] = f;
                int ni = f == 'L' ? poll - 1 : poll + 1;
                if (ni >= 0 && ni < len) {
                    int t = time[poll];
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

        return String.valueOf(res);
    }
}
