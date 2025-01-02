package cn.ccy.leetcode._2023.archive_202308;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/8/16 0016 00:35:12
 * @description https://leetcode.cn/problems/find-the-losers-of-the-circular-game/
 */
public class CircularGameLosers {
    public static void main(String[] args) {
        int n = 5, k = 2;
        System.out.println(Arrays.toString(new CircularGameLosers().circularGameLosers(n, k)));
    }

    public int[] circularGameLosers(int n, int k) {
        int[] mark = new int[n];
        mark[0] = 1;
        int idx = 0;
        int count = 1;
        while (true) {
            idx = (idx + count * k) % n;
            if (mark[idx] == 1) {
                break;

            } else {
                mark[idx] = 1;
            }
            count++;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < mark.length; i++) {
            if (mark[i] == 0) {
                list.add(i + 1);
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
