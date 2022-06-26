package com.ciao.leetcode.archive_202206;

import java.util.*;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/6/26 0026
 * @description https://leetcode.cn/problems/random-pick-with-blacklist/
 */
public class Pick {
    public static void main(String[] args) {
        Pick pick = new Pick(7, new int[]{2, 3, 5});
    }

    Map<Integer, Integer> b2w;
    Random random;
    int bound;

    public Pick(int n, int[] blacklist) {
        b2w = new HashMap<>();
        random = new Random();
        int m = blacklist.length;
        bound = n - m;
        Set<Integer> black = new HashSet<>();
        for (int b : blacklist) {
            if (b >= bound) {
                black.add(b);
            }
        }

        int w = bound;
        for (int b : blacklist) {
            if (b < bound) {
                while (black.contains(w)) {
                    ++w;
                }
                b2w.put(b, w);
                ++w;
            }
        }
    }

    public int pick() {
        int x = random.nextInt(bound);
        return b2w.getOrDefault(x, x);
    }
}
