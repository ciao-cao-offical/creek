package cn.ccy.leetcode._2023.archive_202301;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Chengyin
 * @version v 1.0.0
 * @date 2023/1/20
 * @description https://leetcode.cn/problems/finding-the-users-active-minutes/
 */
public class FindingUsersActiveMinutes {
    public static void main(String[] args) {

    }

    //【哈希表】
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int[] log : logs) {
            Set<Integer> set = map.computeIfAbsent(log[0], k1 -> new HashSet<>());
            set.add(log[1]);
        }

        int[] statics = new int[k];
        for (Map.Entry<Integer, Set<Integer>> entry : map.entrySet()) {
            Set<Integer> times = entry.getValue();
            ++statics[times.size() - 1];
        }
        return statics;
    }
}
