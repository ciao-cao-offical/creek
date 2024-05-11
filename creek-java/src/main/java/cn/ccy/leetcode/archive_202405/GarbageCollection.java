package cn.ccy.leetcode.archive_202405;

import java.util.HashMap;
import java.util.Map;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2024/5/11 23:22:35
 * @description https://leetcode.cn/problems/minimum-amount-of-time-to-collect-garbage/?envType=daily-question&envId=2024-05-11
 */
public class GarbageCollection {
    public static void main(String[] args) {

    }

    public int garbageCollection(String[] garbage, int[] travel) {
        Map<Character, Integer> distance = new HashMap<>();
        int res = 0, curDis = 0;
        for (int i = 0; i < garbage.length; i++) {
            res += garbage[i].length();
            if (i > 0) {
                curDis += travel[i - 1];
            }
            for (char c : garbage[i].toCharArray()) {
                distance.put(c, curDis);
            }
        }
        return res + distance.values().stream().reduce(0, Integer::sum);
    }
}
