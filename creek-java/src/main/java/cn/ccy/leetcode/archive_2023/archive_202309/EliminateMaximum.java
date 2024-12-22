package cn.ccy.leetcode.archive_2023.archive_202309;

import java.util.Arrays;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/9/3 0003 17:28:44
 * @description https://leetcode.cn/problems/eliminate-maximum-number-of-monsters/?envType=daily-question&envId=2023-09-03
 */
public class EliminateMaximum {
    public static void main(String[] args) {
        int[] dist = {1, 3, 4}, speed = {1, 1, 1};
        System.out.println(new EliminateMaximum().eliminateMaximum(dist, speed));
    }

    public int eliminateMaximum(int[] dist, int[] speed) {
        int[] times = new int[dist.length];
        for (int i = 0; i < dist.length; i++) {
            times[i] = (dist[i] - 1) / speed[i] + 1;
        }
        Arrays.sort(times);
        for (int i = 0; i < dist.length; i++) {
            if (times[i] <= i) {
                return i;
            }
        }
        return dist.length;
    }
}
