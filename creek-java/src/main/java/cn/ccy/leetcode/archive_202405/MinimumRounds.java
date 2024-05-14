package cn.ccy.leetcode.archive_202405;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/5/15 00:37:04
 * @description https://leetcode.cn/problems/minimum-rounds-to-complete-all-tasks/?envType=daily-question&envId=2024-05-14
 */
public class MinimumRounds {
    public static void main(String[] args) {

    }

    public int minimumRounds(int[] tasks) {
        Map<Integer, Integer> cnt = new HashMap<Integer, Integer>();
        for (int task : tasks) {
            cnt.put(task, cnt.getOrDefault(task, 0) + 1);
        }
        int res = 0;
        for (int v : cnt.values()) {
            if (v == 1) {
                return -1;
            }
            if (v % 3 == 0) {
                res += v / 3;
            } else {
                res += 1 + v / 3;
            }
        }
        return res;
    }
}
