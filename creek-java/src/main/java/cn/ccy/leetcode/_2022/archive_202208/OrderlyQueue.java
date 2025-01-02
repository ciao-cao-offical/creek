package cn.ccy.leetcode._2022.archive_202208;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2022/8/3
 * @description https://leetcode.cn/problems/orderly-queue/
 */

public class OrderlyQueue {
    public static void main(String[] args) {

    }

    // 最小表示法 （https://oi-wiki.org/string/minimal-string/）
    // 参考自：https://leetcode.cn/problems/orderly-queue/solution/by-ac_oier-443m/
    public String orderlyQueue(String s, int k) {
        char[] cs = s.toCharArray();
        if (k > 1) {
            Arrays.sort(cs);
            return String.valueOf(cs);
        }

        int i = 0, j = 1, g = 0, len = cs.length;
        while (i < len && j < len && g < len) {
            char a = cs[(i + g) % len];
            char b = cs[(j + g) % len];
            if (a == b) {
                g++;

            } else {
                if (a > b) {
                    i += g + 1;
                } else {
                    j += g + 1;
                }
                if (i == j) {
                    i++;
                }
                g = 0;
            }
        }

        int min = Math.min(i, j);
        return s.substring(min) + s.substring(0, min);
    }
}
